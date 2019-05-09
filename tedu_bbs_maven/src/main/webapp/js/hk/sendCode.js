/**
 * 
 */
var currentCount = countNum = 120; 
var settime = function(o,c) {
    var $obj     = $(o),
        $phone   = $($obj.parents('.code-mode').data('mobile')),   //手机号码
        $nAme   = $($obj.parents('.code-mode').data('nAme')),    //邮箱地址
        // $imgCode   = $($obj.parents('.code-mode').data('imgcode')),    //邮箱地址
        codeType = ( $obj.data("type") == "sms" ),
        timecount;                      //定时器定义

    $obj.text("发送请求中...").attr("disabled", true).addClass('disabled');

    var _onTrigger = function(isOn){
        if(isOn){
            $obj.text("重新发送(" + currentCount + ")").parent().children().attr("disabled", true).addClass('disabled');
            currentCount--;
            timecount = setTimeout(function() {settime($obj)},1000);
        }
        else{
            $obj.text("获取验证码").parent().children().removeAttr("disabled").removeClass('disabled');
            $phone.removeAttr("readonly");
            // $imgCode.removeAttr("readonly");
            $nAme.removeAttr("readonly");
            $obj.text("获取短信验证码");
            clearTimeout(timecount);
            currentCount = countNum; 
        }
    }

    switch (currentCount){
        case 0: //倒计时结束
            _onTrigger(false);
            initCaptcha();
            break;
        case countNum: 
            $.ajax({
                url : "/tedu_bbs_maven/VerifyCode",
                type: 'POST',
                data : {
                        'code'  : $imgCode.val(),
                        't'     : Number(!codeType).toString(),
                        'phone' : $phone.val(),
                        'nAme' : $nAme.val(),
                        'newType': $("#newType").val(),
                        "NECaptchaValidate" : $("*[name='NECaptchaValidate']").val()
                        // 'verifycode':c
                    },
                dataType : 'json',
                success:function(result){
                    if (result.code != "000000") { //成功
                        layer.msg(result.msg);
                        $(".captcha-img").trigger('click');
                        $obj.text("获取短信验证码").removeAttr("disabled").removeClass('disabled');
                        //$(".code-mode").append("<div class=\"imgCodeMsg\"><i class=\"msg-icon\"></i><label for=\"\" class=\"label\">" + data.msg +"</label></div>");
                        initCaptcha();
                        return;
                    }
                    layer.msg('发送成功');
                    $phone.attr("readonly", true);
                    $imgCode.attr("readonly", true);
                    $nAme.attr("readonly", true);
                    _onTrigger(true);
                    $(".btn-primary").removeAttr('disabled',false).removeClass('disabled');
                },
                error:function(){
                    $(".codeBtn").attr("src", getRootPath()+"/getGifCode?" + Math.random());
                    layer.msg('发送失败，请稍后重试',{anim: 6});
                    $obj.text("获取短信验证码").removeAttr("disabled").removeClass('disabled');    
                }
            });
            break;
        default:
            _onTrigger(true);
            break;
    }
};