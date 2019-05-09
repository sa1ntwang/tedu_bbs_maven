$(function() {
	var box = document.querySelector(".box"), txt = document
			.querySelector(".txt"), btn = document.querySelector(".btn"), bg = document
			.querySelector(".bg"), end = false;

	btn.onmousedown = function(e) {
		var e = e || window.event;
		var point = e.clientX - box.offsetLeft;
		btn.onmousemove = function(e) {
			var moveW = e.clientX - box.offsetLeft - point;
			btn.style.left = moveW + "px";
			bg.style.width = moveW + "px";

			if (btn.offsetLeft <= 0) {
				btn.style.left = "0";
			}

			if (btn.offsetLeft >= (box.clientWidth - btn.clientWidth)) {
				btn.style.left = box.clientWidth - btn.clientWidth
				txt.innerHTML = "验证完成";
				btn.onmousemove = null;
				btn.onmousedown = null;
				end = true;
			}
		}

		btn.onmouseup = function() {
			btn.onmousemove = null;
			if (!end) {
				btn.style.left = "0";
				bg.style.width = "0";
			}
		}
	}
});