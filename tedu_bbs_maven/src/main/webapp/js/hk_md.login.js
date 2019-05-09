/**
 * @秒嘀官网前台注册登录JS v1.2.0
 * 依赖jQuery.
 * @author charcho@163.com (xCheukx)
 * Copyright 2016 Miaodiyun.com Inc. All Rights Reserved.
 * 修订于 2016-11-18
 */



//当前计数、倒数总时间
var currentCount = countNum = 120; 
var settime = function(o,c) {
    var $obj     = $(o),
        $phone   = $($obj.parents('.code-mode').data('mobile')),   //手机号码
        $email   = $($obj.parents('.code-mode').data('email')),    //邮箱地址
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
            $email.removeAttr("readonly");
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
                        'email' : $email.val(),
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
                    $email.attr("readonly", true);
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
function initCaptcha() {
    initNECaptcha({
        captchaId: '3aa8d8bffbd249df9e411c9681461d44',
        element: '#captcha_div',
        mode: 'float', // 如果要用触发式，这里改为float即可
        width: '100%',
        onVerify: function(err, ret){
            if(!err){
                // ret['validate'] 获取二次校验数据
            }
        }
    }, function (instance) {
        // 初始化成功后得到验证实例instance，可以调用实例的方法
    }, function (err) {
        // 初始化失败后触发该函数，err对象描述当前错误信息
    });
}
/**
 * 验证码刷新
 * 2016.7.12
 */
var _codeChange = function() {
    $(".codeBtn").attr("src", getRootPath()+"/getGifCode?" + Math.random());
}

function getRootPath(){
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath=window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht=curWwwPath.substring(0,pos);
    //获取带"/"的项目名，如：/uimcardprj
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(localhostPaht);
}

$(window).ready(function(){
    _codeChange()
    var boxHeight = $('.login-page').height()<380?380:$('.login-box').height();
    // $('.login-form').css({'height' : boxHeight});    
    // $('.login-page').css({'margin-top' : '-'+(boxHeight/2)+'px'});
    // $('.login-cover').height(boxHeight);
    //载入文本框焦点高亮与验证方法
    $('#form1').mdInputFocous().initValidform(true);

    //检测是否支持css3 transition属性
    var transitionCheck = function(){
        var el=document.createElement('miaodiyun');
        if(el.style['transition']!==undefined){
            return true;
        }
        return false;
    }

    //登录页动画，不支持则直接显示
    if(transitionCheck){
        setTimeout(function(){$('.login-box').removeClass('loading')},600)
    }
    else{$('.login-box').removeClass('loading');}
});


/**
 * mdInputFocous
 * @description 文本框获得焦点高亮插件
 * @author      xcheukx
 * @date        2016.09.09
 */
(function($) {
    $.fn.extend({
        mdInputFocous: function(options) {
            //默认参数
            var defaults = {
                borderColor: "#0066ff",
                delay: 500
            };

            $elem = this;
            var options = $.extend(defaults, options);

            //在对象里查找文本框
            var input = $('.form-control',this);
            var flexBorder = $(document.getElementById('flex-border') || $("<div id='flex-border'></div>"));

            //触发条件：获取焦点 / 失去焦点
            input.blur(function(){
                // flexBorder.stop().animate({width:0},options.delay);
            });
            input.focus(function(){
                // var $this = $(this);
                // var borderWidth = $this.css('border-bottom-width');
                // flexBorder.css({"height":borderWidth,
                //              "width":0,
                //              "background-color":options.borderColor,
                //              "position":"absolute",
                //              "top":($this.offset().top+$this.outerHeight()-parseInt(borderWidth)),
                //              "left":$this.offset().left,
                //              "z-index":3
                //          });

                // flexBorder.stop().animate({width:$this.outerWidth()},options.delay)
                
                // if(!$("#flex-border").length){$('body').append(flexBorder);}
            })

            //使该jQuery方法可链式
            return this;
        }
    });
})(jQuery);

//========================依赖Validform插件========================
//初始化验证表单
$.fn.initValidform = function (action) {
    var checkValidform = function (formObj) {
        $(formObj).Validform({
            datatype:{
                // "code_silder":function(gets,obj,curform,datatype){
                    // var chang = $("input[name='geetest_challenge']").val();
                    // console.log(chang ==  '');
                    // if(chang == ''){
                    //     return false;
                    // }else{
                    //     return true
                    // }
                // }
            },
            tiptype: function (msg, o, cssctl) {
                if (!o.obj.is("form")) {
                    if(o.obj.parent().hasClass('input-group')){o.obj=o.obj.parent();}
                    //页面上不存在提示信息的标签时，自动创建;
                    if (o.obj.parent().find(".validform-box").length == 0) {
                        o.obj.parent().append("<div class='validform-box'><i class='msg-icon'></i><label for='' class='label'></label></div>");
                        //o.obj.parents(".reg-rows").next().find(".Validform_checktip").remove();
                        
                    }
                    var objtip = o.obj.parent().find(".validform-box");
                    switch(o.type){
                        case 2:
                            o.obj.parent().removeClass('has-error has-feedback').addClass('has-success has-feedback');
                            o.obj.parent().find('.fa').remove();
                            o.obj.after('<span class="fa fa-check form-control-feedback"></span>')
                            break;
                        case 3:
                            o.obj.parent().removeClass('has-success has-feedback').addClass('has-error has-feedback');
                            o.obj.parent().find('.fa').remove();
                            o.obj.after('<span class="fa fa-remove form-control-feedback"></span>')
                            break;
                    }

                    cssctl(objtip, o.type);
                    objtip.find(".label").text(msg);
                    validMethod(o);
                }
            },
            showAllError: false,
            // ,ajaxPost:isAjax,
            callback:function(data){
               $("#get-form").addClass('disabled');
            }
        });
    };
     $("#get-form").on('click',function(){
        if($("#get-form").hasClass('disabled')){
            return false
        };
     })
    //验证触发事件
    var validMethod=function(o){
        var $mobile  = $("#uMobile"),
            $email   = $("#uEmail");
            $imgCode = $("#imgCode");
        if(!(o.obj.attr('id')==$email.attr('id')||o.obj.attr('id')==$mobile.attr('id') ||o.obj.attr('id')==$imgCode.attr('id') )){
            //console.log('不执行下面操作');
            return;
        }
        switch(action){
            case "repassword":
                if(o.type==2){
                    if(true&&validCheck($mobile)&&validCheck($imgCode)){ //2为通过验证的情况
                        $(".code-mode").children().removeAttr("disabled").removeClass("disabled");
                    }
                }
                else{
                    // if(false&&!validCheck($mobile)&&!validCheck($imgCode)){
                        //console.log('添加disabled');
                        // $(".code-mode").children().attr("disabled",true).addClass("disabled");
                    // }
                }
            break;
            case "regPage":
                //if(o.obj[0].id=="uEmail")
                if(o.type==2){
                    //if (validCheck($mobile,true)&&validCheck($email,true)&&validCheck($imgCode,true)) {
                    if(true&&validCheck($mobile,true)&&validCheck($email,true)&&validCheck($imgCode,true)) {
                        console.log('移除disabled');
                        $(".code-mode").children().removeAttr("disabled").removeClass("disabled");
                    }
                }
                else{
                    //if (validCheck($mobile,false)||validCheck($email,false)||validCheck($imgCode,false)) {
                    if (true||!validCheck($email)||!validCheck($mobile)) {
                        console.log('添加disabled');
                        // $(".code-mode").children().attr("disabled",true).addClass("disabled");
                    }
                }
            break;
        }
    }

    //判断是否通过验证
    //var validCheck = function(obj,status){
    var validCheck = function(obj){
        var result = obj.parents("form").Validform({tiptype:2}).check(false,obj);
        console.log(result)
        return result;
        //return result == status;
        //return obj.parents(".reg-rows").find(".msg-box").hasClass(status ?"Validform_right":"Validform_wrong");
    }

    return $(this).each(function () {
        checkValidform($(this));
    }); 
}
//======================以上依赖Validform插件======================

var handlerEmbed = function (captchaObj) {
        if(captchaObj !== 'reset'){
            captchaObj.appendTo("#silder-box-only");
            captchaObj.onSuccess(function () {
                var result = captchaObj.getValidate();
                $(".code-mode").children().removeAttr("disabled").removeClass("disabled");
                $(".code-mode").children().removeAttr("disabled").removeClass("disabled");

            });
            captchaObj.onError(function(){
                captchaObj.reset();
            });
            captchaObj.onReady(function () {
                document.getElementById('loading-tip').style.display = 'none';
            })
            Za = captchaObj;
        }else{
            Za.reset();
        }
    };

var codeVerification = function($this){
    var $mobile  = $("#uMobile"),
        $email   = $("#uEmail");
        $email.trigger('blur');
        $mobile.trigger('blur');
        _this = $this;
        if($email.siblings('span').hasClass('fa-remove')){
            return !1;
        }
        if($mobile.siblings('span').hasClass('fa-remove')){
            return !1;
        }
    var postData = {
            geetest_challenge: $("input[name='geetest_challenge']").val(),
            geetest_validate: $("input[name='geetest_validate']").val(),
            geetest_seccode: $("input[name='geetest_seccode']").val(),
            iphone : $mobile.val()
        };
    settime(_this);
    // $.ajax({
    //   type: "get",
    //   url: "/tedu_bbs_maven/VerifyCode",
    //   data: {
    //       _code:$("#imgCode").val(),
    //       NECaptchaValidate : $("*[name='NECaptchaValidate']").val()
    //   },
    //   dataType:"json",
    //   success : function(data){
    //     if(data == "no"){
    //         layer.msg('滑动验证码错误');
    //         $(".captcha-img").trigger('click');
    //         return false;
    //     }else if(data == "yes"){
    //         settime(_this);
    //     }else{
    //         layer.msg('您的操作繁忙，请稍后再试');
    //         return false;
    //     }
    //   }
    // })
  }

