/**
 * @desc 弹出层的js
 * @param {} options
 * @returns {} 
 */
var popUpDialog=function(options){
	options = options || {};
	this.title=options.title || 'title';
	this.width=options.width || 200;
	this.height=options.height || 160;
	this.url=options.url || '';
	this.content=options.content || '';
	this.init();
}

popUpDialog.prototype={
	init:function(){
		var that=this;
		var tpl=popUpDialog.tpl;
		if($("body").find(".shade")){
			$("body").find(".shade").remove();
			$("body").find(".pop01").remove();
		}
		$("body").append(tpl);
		
		if(this.url!=''){
			$(".pop_item").empty();
    		$(".pop_item").append(that._getIframe());
		}
		if(this.content!=''){
			$(".pop_item").empty();
			$(".pop_item").append(that.content);
		}
		if(this.title){
			that.setTitle();
		}
		$(".pop01").css({"width":that.width});   
		$(".pop_item").css("height",that.height);
		var offset=this._getOffset();
		$('.pop01').css({left: offset.left + 'px', top: offset.top + 'px','display': 'block'}); 
		that.show();
	},
	show:function(){
		if(!$(".pop01").is(":hidden")){
			$(".pop01,.shade").show();
    	}
	},
	hide:function(){	
    	if($(".pop01").is(":visible")){
    		$(".pop01,.shade").hide();
    	}
	},
	setTitle:function(){
		$("#pop_title").children("span").html(this.title);
	},
	_getIframe:function(){
		return "<iframe scrolling='auto' frameborder='0' width='100%' height='100%'"+"src="+this.url+">"+"</iframe>";
	},
	_getOffset:function(){
		var screenWidth= $(window).width(), screenHeight = $(window).height(); //当前浏览器窗口的 宽高 
		//var screenWidth= $('.pop01').width(), screenHeight = $('.pop01').height(); //当前浏览器窗口的 宽高 
		var scrolltop= $(document).scrollTop();//获取当前窗口距离页面顶部高度 
		var objLeft = (screenWidth - $('.pop01').width())/2 ; 
		var objTop= (screenHeight - $('.pop01').height())/2 + scrolltop;
		if(objTop<10) objTop=47;
		return {"left":objLeft,"top":objTop};
	},
	destroy:function(){
		$(".pop01").remove();
	}
};

popUpDialog.tpl=
	'<div class="shade"></div>'+
	'<div class="pop01">'+
		'<h4 class="pop_title" id="pop_title">'+
			'<a href="javascript:void(0);" id="popClose" class="popClose" onclick="popCloseCustDetail()">关闭</a><span>关联销售机会</span>'+
			//'<a href="javascript:void(0);" id="popClose">关闭</a><span>关联销售机会</span>'+
		'</h4>'+
		'<div class="pop_item" style="height: 540px;"></div>'+
	'</div>';



//弹出浮出窗口
function popUpPage(url,popTitile,width,height){
	var str = "<iframe  scrolling='auto' frameborder='0' width='100%' height='100%'"+"src="+url+">"+"</iframe>";
	$("#pop_title").children("span").html(popTitile);
	var wd=width/2;
	var ht=height/2;
	
	
	$(".pop01").css({"width":width});   
	$(".pop_item").css("height",height);
	var screenWidth= $(window).width(), screenHeight = $(window).height(); //当前浏览器窗口的 宽高 
	var scrolltop= $(document).scrollTop();//获取当前窗口距离页面顶部高度 
	var objLeft = (screenWidth - $('.pop01').width())/2 ; 
	var objTop= (screenHeight - $('.pop01').height())/2 + scrolltop; 
	
	
	$('.pop01').css({left: objLeft + 'px', top: objTop + 'px','display': 'block'}); 
	if(!$(".pop01").is(":hidden")){
		//if(count == 0){
		$(".pop_item").empty();
		$(".pop_item").append(str);
		//$(".pop01").css({"width":width,"margin-top":-ht,"margin-left":-wd});   
		//	count = count+1;
		//}
		$(".pop01,.shade").show();
	}
    	 
	$("#pop_title").addClass(".width");
}


function closePopUpPage(iframe1,iframe2){
	 /**  if(document.getElementById(iframe1)){
    		var psrc = document.getElementById(iframe1).src;
    		document.getElementById(iframe1).src = psrc;
    	}
    	if(document.getElementById(iframe2)){
    	var psrc = document.getElementById(iframe2).src;
    	document.getElementById(iframe2).src = psrc;
    	}
    **/
		var hidden = $(".pop01").is(":visible")
    	if(hidden){
    		$(".pop01,.shade").hide();
    	}
    	//$(".pop_item").html("");    
}

