<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="common" uri="http://zhiyou100.com/common/"%>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>课程管理</title>
    <link href="${pageContext.servletContext.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.servletContext.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/jquery.validate.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/js/messages_zh.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/echarts/dist/echarts.js"></script>
    <style>
    
    </style>
    
    <script>
    var $dataNum=[];
    var $dataName=[];
    $(function() {
    	 var $temp=${dataInfo};
    	 for(var i=0;i<$temp.length;i++)  
         {  
    		 $dataName.push($temp[i].dataName);  
    		 $dataNum.push($temp[i].dataNum);  
         } 
	});
        
		    require.config({
		        paths: {
		            echarts:'${pageContext.request.contextPath}/echarts/dist'
		        }
		    });
		    
		    require(
		            [
		                'echarts',
		                'echarts/chart/bar', // 使用柱状图就加载bar模块，按需加载
		                'echarts/chart/line'
		            ],
		            function (ec) {
		                // 基于准备好的dom，初始化echarts图表
		                var myChart = ec.init(document.getElementById('chart')); 
		                
		                var option = {
		                		 title : {
		                		        text: '课程平均播放次数',
		                		        subtext: '数据来源：zhiyou100.com',
		                		        x : 'center'
		                		 },
		                	calculable : true,
		                	
		                	toolbox: {
						        show : true,
						        feature : {
						            mark : {show: true},
						            dataView : {show: true, readOnly: false},
						            magicType : {show: true, type: ['line', 'bar']},
						            restore : {show: true},
						            saveAsImage : {show: true}
						        }
						    },
		                	
		                    tooltip: {
		                        show:true
		                    },
		                    legend: {
		                        data:['播放量'],
		                        x : 'center',
		                        y : 'bottom'
		                    },
		                    xAxis : [
		                        {
		                            type : 'category',
		                            data : $dataName
		                        }
		                    ],
		                    yAxis : [
		                        {
		                        	name : '平均播放次数（times）',
		                        	nameLocation : 'end',
		                            type : 'value',
		                           
		                            
		                        }
		                    ],
		                    series : [
		                        {
		                            "name":"播放量",
		                            "type":"line",
		                            "data": $dataNum,
		                            markPoint : {
					                data : [
					                    {type : 'max', name: '最大值'},
					                    {type : 'min', name: '最小值'}
					                		]
					            		},
					            	markLine : {
						                data : [
						                    {type : 'average', name: '平均值'}
						                ]
						            },
						            itemStyle:{
						            	normal:{
						            		color:'#3fa1ff'
						            	}
						            }
		            
		                        }
		                    ]
		                };
		        
		                // 为echarts对象加载数据 
		                myChart.setOption(option); 
		            }
		        );
    
    
    </script>
    
  </head>
	<body>
	
	<%@ include file="/frame.jsp" %>
	<input type="hidden" id="viewflag" value="4">
  <div class="container" align="top">
  	<div class="jumbotron">
  <h3>课程播放统计-报表分析</h3>
	</div>
	<div id="chart" style="height: 400px;"></div>
	
  	</div>
 	</body>

</html>
