function retrieveGuests() {
	var url = '/th-spring-integration/spring/guests';
	
	if ($('#searchName').val() != '') {
		url = url + '/' + $('#searchName').val();
	}
	
	$("#resultsBlock").load(url);
}