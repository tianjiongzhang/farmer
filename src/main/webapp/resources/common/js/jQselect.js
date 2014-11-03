jQuery.fn.extend({
	selectArrID:[],
	selectbox: function(options) {
		var that=this;
		return this.each(function() {
			that.selectArrID.push(this);
			new jQuery.SelectBox(this, options);
		});
	}
});

/* pawel maziarz: work around for ie logging */
if (!window.console) {
	var console = {
			log: function(msg) { 
	 }
	}
}
/* */
jQuery.SelectBox = function(selectobj, options) {
	
	var opt = options || {};
	opt.inputClass = opt.inputClass || "selectbox";
	opt.containerClass = opt.containerClass || "selectbox-wrapper";
	opt.hoverClass = opt.hoverClass || "current";
	opt.currentClass = opt.selectedClass || "selected"
	opt.debug = opt.debug || false;
	
	var elm_id = selectobj.id;
	var active = 0;
	var inFocus = false;
	var hasfocus = 0;

	//jquery object for select element
	var $select = $(selectobj);
	// jquery container object
	var $container = setupContainer(opt);
	//jquery input object 
	var $input = setupInput(opt);
	// hide select and append newly created elements
	$select.hide().before($input).before($container);
	var browser=browser();
  var browserName=browser[0];
	
	init();
	
	$input
	.click(function(){
    if (!inFocus) {
		  $container.toggle();
		}
	})
	.focus(function(){
	   if ($container.not(':visible')) {
	       inFocus = true;
	       var selectArrID=jQuery.fn.selectArrID;
	      for(var i=0;i<selectArrID.length;i++){
	    	  $("#"+selectArrID[i].id+"_container").hide();
	      }
	       $container.show();
	   }
	})

	.keydown(function(event) {
		switch(event.keyCode) {
			case 38: // up
				event.preventDefault();
				moveSelect(-1);
				break;
			case 40: // down
				event.preventDefault();
				moveSelect(1);
				break;
			//case 9:  // tab
			case 13: // return
				event.preventDefault(); // seems not working in mac !
				$('li.'+opt.hoverClass).trigger('click');
				break;
			case 27: //escape
                if(hasfocus==null){
                    hideMe();
                }
			  break;
		}
	})

	.blur(function() {
		if ($container.is(':visible') && hasfocus > 0 ) {
			if(opt.debug) console.log('container visible and has focus')
		} else {
		  // Workaround for ie scroll - thanks to Bernd Matzner
			/*
		  if(browserName=='IE'|| browserName=='Safair'){
              if(hasfocus==null){
                  hideMe();
              }
      } else {
              if(hasfocus==null){
                  hideMe();
              }
      }*/ hideMe();
		}
	});

	function hideMe() {
		hasfocus=0;
		$container.hide();
        console.log(hasfocus);
	}
	
	function init() {
		$container.append(getSelectOptions($input.attr('id'))).hide();
		var width = $input.css('width');
    }
	
	function setupContainer(options) {
		var container = document.createElement("div");
		$container = $(container);
		$container.attr('id', elm_id+'_container');
		$container.addClass(options.containerClass);

		return $container;
	}
	
	function setupInput(options) {
		var input = document.createElement("input");
		var $input = $(input);
		$input.attr("id", elm_id+"_input");
		$input.attr("type", "text");
		$input.addClass(options.inputClass);
		$input.attr("autocomplete", "off");
		$input.attr("readonly", "readonly");
		$input.attr("tabIndex", $select.attr("tabindex")); // "I" capital is important for ie
		return $input;
	}

	function moveSelect(step) {
		var lis = $("li", $container);
		if (!lis || lis.length == 0) return false;
		active += step;
        //loop through list
		if (active < 0) {
			active = lis.size();
		} else if (active > lis.size()) {
			active = 0;
		}
        scroll(lis, active);
		lis.removeClass(opt.hoverClass);
		$(lis[active]).addClass(opt.hoverClass);
	}

	function scroll(list, active) {
      var el = $(list[active]).get(0);
      var list = $container.get(0);

      if (el.offsetTop + el.offsetHeight > list.scrollTop + list.clientHeight) {
        list.scrollTop = el.offsetTop + el.offsetHeight - list.clientHeight;
      } else if(el.offsetTop < list.scrollTop) {
        list.scrollTop = el.offsetTop;
      }
	}
	
	function setCurrent() {
		var li = $("li."+opt.currentClass, $container).get(0);
		var ar = (''+li.id).split('_');
		var el = ar[ar.length-1];
		$select.val(el);
		$input.val($(li).html());
		return true;
	}
	
	// select value
	function getCurrentSelected() {
		return $select.val();
	}
	
	// input value
	function getCurrentValue() {
		return $input.val();
	}
	
	function getSelectOptions(parentid) {
		var select_options = new Array();
		var ul = document.createElement('ul');
		$select.children('option').each(function() {
			var li = document.createElement('li');
			li.setAttribute('id', parentid + '_' + $(this).val());
			li.innerHTML = $(this).html();
			if ($(this).is(':selected')) {
				$input.val($(this).html());
				$(li).addClass(opt.currentClass);
			}
			ul.appendChild(li);
			$(li)
			.mouseover(function(event) {
				hasfocus = 1;
				if (opt.debug) console.log('over on : '+this.id);
				jQuery(event.target, $container).addClass(opt.hoverClass);
			})
			.mouseout(function(event) {
				hasfocus = -1;
				if (opt.debug) console.log('out on : '+this.id);
				jQuery(event.target, $container).removeClass(opt.hoverClass);
			})
			.click(function(event) {
			  var fl = $('li.'+opt.hoverClass, $container).get(0);
				if (opt.debug) console.log('click on :'+this.id);
				$('#' + elm_id + '_container' + ' li.'+opt.currentClass).removeClass(opt.currentClass);
				$(this).addClass(opt.currentClass);
				setCurrent();
				//$select.change();
				$select.get(0).blur();
				hideMe();
			});
		});
		return ul;
	}

	function browser(){
       var ua=window.navigator.userAgent,
               ret="";
       if(/Firefox/g.test(ua)){
           ua=ua.split(" ");
           ret="Firefox|"+ua[ua.length-1].split("/")[1];
       }else if(/MSIE/g.test(ua)){
           ua=ua.split(";");
           ret="IE|"+ua[1].split(" ")[2];
       }else if(/Opera/g.test(ua)){
           ua=ua.split(" ");
           ret="Opera|"+ua[ua.length-1].split("/")[1];
       }else if(/Chrome/g.test(ua)){
           ua=ua.split(" ");
           ret="Chrome|"+ua[ua.length-2].split("/")[1];
       }else if(/^apple\s+/i.test(navigator.vendor)){
           ua=ua.split(" ");
           ret="Safair|"+ua[ua.length-2].split("/")[1];
       }else{
           ret="未知浏览器";
       }
       return ret.split("|");
   }
};
