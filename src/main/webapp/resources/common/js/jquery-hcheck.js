(function($){
	$.fn.hcheckbox=function(options){
		return $(':checkbox+span',this).each(function(){
			$(this).addClass('checkbox');
           if($(this).prev().is(':disabled')==false){
              if($(this).prev().is(':checked')){
				    		$(this).addClass("checked");
				    	}
          }else{
              $(this).addClass('disabled');
          }
		}).click(function(event){
				if(!$(this).prev().is(':checked')){
				    $(this).addClass("checked");
            $(this).prev()[0].checked = true;
           if(typeof options!='undefined'){
        	   options.callback&&options.callback($(this),$(this).prev()[0].checked);
           }           
         }else{
            $(this).removeClass('checked');			
            $(this).prev()[0].checked = false;
         }
         event.stopPropagation();
			}
		);
	}

  $.fn.hradio = function(options){
      var self = this;
      return $(':radio+label',this).each(function(){
          $(this).addClass('hRadio');
          if($(this).prev().is("checked")){
            $(this).addClass('hRadio_Checked');
          }
      }).click(function(event){
          $(this).siblings().removeClass("hRadio_Checked");
          if(!$(this).prev().is(':checked')){
							$(this).addClass("hRadio_Checked");
              $(this).prev()[0].checked = true;
          } 
          event.stopPropagation();
      });
  }

})(jQuery)﻿;