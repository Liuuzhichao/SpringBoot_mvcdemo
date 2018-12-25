/*$("#addBtn").on("click",function(){
	$.ajax({
		url : "restful_addUser",
		type : "post",
		data : {
			id : 1001,
			name : "restful01",
			birthday : "1991-1-1",
			address : "bj"
		},
		dataType : "json",
		success : function(data) {
			$("#showMessage").append("数据增加成功:"+data.flag);
		},
		error : function() {
			$("#showMessage").append("数据增加失败!!!");
		}
	})
})*/

function restful_deleteUser() {
	alert("start");
	$.ajax({
		url : "http://127.0.0.1:8080/resrful_delete/1001",
		type : "delete"
	})
}
