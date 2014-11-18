/**
 * 关闭当前标签
 * 
 * @param tab
 *            当前标签元素
 */
function closeTab(tab) {
	// 如果关闭的是当前标签，则将前一个标签置为当前标签
	if ($(tab).hasClass("current")) {
		$(tab).prev('a').click();
	}

	var tabId = $(tab).attr("id");
	var ifrm = $("#Frame-" + tabId);
	ifrm.remove();
	$(tab).remove();
}

/**
 * 重新加载标签对应的内容页面
 * 
 * @param tab
 *            当前标签元素
 */
function refreshTab(tab) {
	var tabId = $(tab).attr("id");
	var ifrm = $("#Frame-" + tabId);
	var targetUrl = ifrm.attr("src");
	ifrm.attr("src", targetUrl);
}

/**
 * 显示标签及对应的内容页面
 * 
 * @param tab
 *            当前标签元素
 */
function displayTab(tab) {
	$("#tabbar").children().removeClass("current");
	$(tab).addClass("current");

	var tabId = $(tab).attr("id");
	var ifrmId = "Frame-" + tabId;
	$.each($("#contentArea").children("iframe"), function(k, v) {
		if ($(this).attr("id") == ifrmId) {
			$(this).show();
		} else {
			$(this).hide();
		}
	});
}

/**
 * 添加一个新的标签
 * 
 * @param name
 *            标签名称
 * @param targetUrl
 *            需要加载的URL
 * @param hasCloseBtn
 *            是否带关闭按钮
 */
function addTab(id, name, targetUrl, hasCloseBtn) {
	var existFlag = false;
	// 如果标签已经存在，则不再添加标签，只做选择处理
	$.each($("#tabbar").children("a"), function(k, v) {
		if ($(this).attr("id") == id) {
			existFlag = true;
			$(this).click();
		}
	});

	// 如果标签不存在，则创建新的标签
	if (!existFlag) {
		var selectedTab = $('<a></a>');
		selectedTab.attr("id", id);
		selectedTab.text(name);
		selectedTab.attr("href", "#");
		if (hasCloseBtn) {
			var closeBtn = $('<span></span>');
			closeBtn.bind('click', function() {
				closeTab($(this).parent());
			});

			selectedTab.append(closeBtn);
		}

		selectedTab.bind('click', function() {
			displayTab(this);
			refreshTab(this);
			$("#nav").hide();
		});

		$("#tabbar").append(selectedTab);

		var selectedIframe = $("<iframe><iframe/>");
		selectedIframe.attr("id", "Frame-" + id);
		selectedIframe.attr("name", name);
		selectedIframe.attr("frameborder", "0");
		selectedIframe.attr("src", targetUrl);
		$("#contentArea").append(selectedIframe);

		selectedTab.click();
	}

	$(window).resize();
}
