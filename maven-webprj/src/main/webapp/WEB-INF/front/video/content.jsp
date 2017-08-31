<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhouyc
  Date: 2017/6/30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>


<div class="intro">
	<div class="container">
		<div class="v-intro">
			<div class="left" id="left">
				<video id="videoPlayer" src="${FrontData.videoUrl}" class="video-js vjs-default-skin" controls width="627" height="280"
					   poster="${FrontData.videoImageUrl}" data-setup="{}">
				</video>
			</div>

			<div class="right">
				<p class="right-title">${FrontData.videoTitle}</p>
				<div class="avatar">
					<span style="background-image: url(${FrontData.speakerHeadUrl})"></span>
					<p><b>讲师：${FrontData.speakerName}</b><br><i>${FrontData.speakerDescr}</i></p>
				</div>
				<p class="video-intro">
					<span>本节内容：</span> ${FrontData.videoDescr}
				</p>
			</div>
		</div>

		<div class="kcjs">
			<p class="title">课程介绍</p>
			<p class="content">${FrontData.courseDescr}</p>
		</div>

	</div>
</div>
<!--目录-->
<div class="catalog">
	<div class="container">
		<p class="title">目录</p>

		<c:forEach items="${videoList}" var="video" >
			<div class="chapter" id="video">
				<p class="biaoti"><a href="${pageContext.servletContext.contextPath}/front/video/index.action?videoId=${video.id}&subjectId=${FrontData.subId}">${video.videoTitle}</a></p>
				<p class="lecturer">${video.videoDescr}</p>
				<p class="lecturer">讲师：${video.speakerName}</p>
				<div class="v-info">
					<span class="count"><img src="${pageContext.servletContext.contextPath}/static/img/count.png" alt="">${video.videoPlayTimes}</span>
					<span class="duration"><img src="${pageContext.servletContext.contextPath}/static/img/player.png" alt="">${video.videoLengthStr}</span>
				</div>
			</div>
		</c:forEach>


	</div>
</div>