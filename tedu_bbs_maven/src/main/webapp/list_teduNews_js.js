
$(function() {
	/* $(".editThis").on("click",editThis); */
	$(".editStuNewsTab").on(
			"click",
			function() {
				// var str = $(this).html()=="修改"?"确定":"修改";
				var currentBtn = $(this).html();
				if(currentBtn == "确定"){
					console.log("此处添加提交代码!");
				}
				var str = $(this).html() == "确定" ? "修改" : "确定";
				
				console.log(str);
				$(this).html(str); // 按钮被点击后，在“编辑”和“确定”之间切换
				/*
				 * if($(this).html()=="确定"){ $(this).html("修改"); //
				 * 按钮被点击后，在“编辑”和“确定”之间切换 } if($(this).html()=="修改"){
				 * $(this).html("确定"); // 按钮被点击后，在“编辑”和“确定”之间切换 }
				 */
				$(this).parent().parent().siblings("td").each(
						function() { // 获取当前行的其他单元格
							obj_text = $(this).find("input:text"); // 判断单元格下是否有文本框
							if (!obj_text.length) // 如果没有文本框，则添加文本框使之可以编辑
								$(this).html(
										"<input type='text' id="
												+ $(this).attr("id")
												+ " style='width:100%' value='"
												+ $(this).text() + "'>");
							else
								// 如果已经存在文本框，则将其显示为文本框修改的值
								$(this).html(obj_text.val());
						});
			});
});
function editThis() {
	debugger
	var t_this = $(this);
	var list = $(t_this).parent().parent().parent().parent().find("td:lt(10)");
	$.each(list, function(i, obj) {
		$(obj).html("<input type='text' value='" + $(obj).text() + "'/>");
	});
}


