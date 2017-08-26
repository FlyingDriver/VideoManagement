<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="common" uri="http://zhiyou100.com/common/"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>视频列表</title>
 <link href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.servletContext.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>
    <style>
    
    </style>
    <script>
  		var count=0;
   		var arr=document.getElementsByName("selectall");
   	function selectall(id){
   		var sel=document.getElementById(id);
   		if(sel.checked){
   			for(var i=0; i<=arr.length; i++){
			arr[i].checked =true;
			}
   		}
   		else{
   			for(var i=0; i<=arr.length; i++){
			arr[i].checked =false;
			}
   		}
   	}
   	$(function() {
   		$("#batchesDelete").on("click",function(){
   			var selectedId= new Array();
   	   		var j=0;
   				for(var i=0; i<arr.length; i++){
   					if(arr[i].checked ==true){
   						selectedId[j]=arr[i].id;
   						alert(selectedId[j]);
   						j++;	
   					}
   				}
   			$("#num").text(selectedId.length);
   	   		$('#batches').modal('show');
   	   		$('#conf').on('click',function(){
   	   			$.ajax({  
   	   	   			  type : 'POST',  
   	   	   			  url:'/maven-webprj/batchesDelete.action',  
   	   	   			  contentType : "application/json" ,
   	   	   			  data : JSON.stringify(selectedId)
   	   	   			}); 
   	   			$('#batches').modal('hide');
   	   			});	
   		});
	});

   	$(function(){
   		$('.count').on('click',function(){
   	   		var n=0;
   	   		for(var i=0;i<arr.length;i++){
   	   			if(arr[i].checked ==true){
   	   				n++;
   	   			}
   	   		}if(n!=0){$("#badge").text(n);}
   	   		else{
   	   			$("#badge")[0].innerHTML=null;
   	   		}
   	   	});
   	});
   	
   	
   	
   	
   </script>
</head>
<body>
<%@ include file="/frame.jsp" %>
<input type="hidden" id="viewflag" value="1">
  <div class="container">
  	<div class="jumbotron">
  <h3>视频列表-视频管理</h3>
	</div>
  	<div style="float: left;">
  		<a href="${pageContext.servletContext.contextPath}/addVideo.action"><button type="button" class="btn btn-primary">添加视频</button></a>&nbsp;
  		<button class="btn btn-primary" type="button" id="batchesDelete">批量删除<span class="badge" id="badge"></span></button>
  	</div>
  	<div style="float: right;">
  			<form class="form-inline" action="${pageContext.servletContext.contextPath}/videoList.action">
				  <div class="form-group">
				   <input type="text" class="form-control" placeholder="视频标题" style="width: 150px;" name="title" value="${tit eq '' ? '':tit}">
				  </div>
				  <div class="form-group">
				    <select class="form-control" style="width: 150px;" name="speaker">
						  <option value="">请选择主讲人</option>
						  <c:forEach items="${allSpeaker}" var="speaker">
						  	<option ${spe eq speaker.speakerName ? 'selected':''}>${speaker.speakerName }</option>
						  </c:forEach>
						</select>	
				  </div>
				  <div class="form-group">
				    <select class="form-control" style="width: 150px;" name="course">
						  <option value="">请选择课程</option>
						 <c:forEach items="${allCourse}" var="course">
						  	<option ${cou eq course.courseName ? 'selected':''}>${course.courseName }</option>
						  </c:forEach>
						</select>	
				  </div>
				  <button type="submit" class="btn btn-primary">查询</button>
			</form>
  	</div><br/><br/><br/>
  <div class="container">
  	<div class="bs-example" data-example-id="hoverable-table">
    <table class="table table-hover table-condensed" style="vertical-align: middle;text-align: center;">
      <thead>
        <tr>
          <th class="col-sm-1">
          	<input type="checkbox" onclick="selectall(this.id)" id="sel" class="count">全选</input>
          	</th>
          <th  style="text-align:center;">序号</th>
          <th  style="text-align:center;">名称</th>
          <th  style="text-align:center;">介绍</th>
          <th  style="text-align:center;">讲师</th>
          <th  style="text-align:center;">课程</th>
          <th  style="text-align:center;">时长（秒）</th>
          <th  style="text-align:center;">播放次数</th>
          <th  style="text-align:center;">编辑</th>
          <th  style="text-align:center;">删除</th>
        </tr>
      </thead>
      <tbody>
      <c:forEach items="${page.rows}" var="video" varStatus="status">
        <tr>
          <td> <!-- style="text-align:left;" -->
          	<input type="checkbox" name="selectall" id="${video.id}" class="count"/>
          </td>
		  <th scope="row" style="text-align:center;">${status.count+5*(page.page-1)}</th>
          <td >${video.videoTitle}</td>
          <td>${video.videoDescr}</td>
          <td>${video.speakerName}</td>
          <td>${video.courseName}</td>
          <td>${video.videoLength}</td>
          <td>${video.videoPlayTimes}</td>
          <td><a class="glyphicon glyphicon-pencil" aria-hidden="true" href="<c:url value="updateVideo.action?id=${video.id}"/>"></a></td>
          <td><a class="glyphicon glyphicon-trash" aria-hidden="true" href="" 
          		 data-toggle="modal" data-target="#deleteModal${status.count}"></a></td>
        </tr>
        
        
        
        		<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel" id="deleteModal${status.count}">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="gridSystemModalLabel">警告</h4>
				      </div>
				      <div class="modal-body">
				        <div class="row">
				        	<div class="col-md-offset-1">此操作将永久删除选项，确认删除以下项目？</div>
				         </div>
				         <div class="row">
				         	  <div class="col-md-offset-3">主讲人：${video.speakerName}</div>
				         	  <div class="col-md-offset-3">视频：${video.videoTitle}</div>
				         </div>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				        <button type="button" class="btn btn-primary" onclick="javascript:location.href='<c:url value='deleteVideo.action?id=${video.id}'/>'">确定</button>
				      </div>
				    </div><!-- /.modal-content -->
				  </div><!-- /.modal-dialog -->
				</div><!-- /.modal -->
        
        </c:forEach>
      </tbody>
    </table>
  </div>
 </div>
 <common:page url="${pageContext.request.contextPath}/videoList.action"/>
  </div>
  
  
  
  <div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel" id="batches">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="gridSystemModalLabel">警告</h4>
				      </div>
				      <div class="modal-body">
				        <div class="row">
				        	<div class="col-md-offset-1"><h4>此操作将永久删除选项，确认批量删除所选的<span id="num"></span>个项目？</h4></div>
				         </div>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				        <button id="conf" type="button" class="btn btn-primary">确定</button>
				      </div>
				    </div><!-- /.modal-content -->
				  </div><!-- /.modal-dialog -->
				</div><!-- /.modal -->
  
</body>
</html>