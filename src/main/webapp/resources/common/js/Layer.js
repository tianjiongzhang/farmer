/**
 *Layer 
 * eg.
 * var l = new Layer().show().hide();
 */
function Layer(msg) {
	this.msg = msg || '';
	this.init();
};

Layer.prototype = {
	init : function () {
		$('body').append('<span id="loading_content" class="bg_loading dn">' + this.msg + '</span><div id="filter_content_dn" class="dn"></div>');
	},
	hide : function () {
		$('#loading_content').addClass('dn');
		$('#filter_content_dn').addClass('dn');
	},
	show : function () {
		$('#loading_content').removeClass('dn');
		$('#filter_content_dn').removeClass('dn');
	},
	setMsg : function (title) {
		$("#loading_content").text(title);
	}
};
