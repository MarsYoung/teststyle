function changeQuestionPage(url) {
	window.location.href=url;
}

function changeUserInfoPage(url) {
	$('#userinfos').load(url);
}
