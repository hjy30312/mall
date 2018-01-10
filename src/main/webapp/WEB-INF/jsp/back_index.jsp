
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>

<html>
<head>
    <script src="<%=path%>/static/plugins/jquery-2.1.4/jquery.min.js"></script>
    <jsp:include page="common/head.jsp"/>
    <link rel="stylesheet" href="<%=path%>/static/background/css/shopui.css"/>
    <script src="<%=path%>/static/background/js/Ldroptree.js"></script>
</head>
<body>
<div id="main">
    <!--顶部页头-->
    <div class="topNav">
        <div class="logoBar fl">
            <a href="#"><img src="shopclass/logo.jpg" alt="电商网"></a>
        </div>
        <div class="logoText fr">
            <h3 class="head-text">xxxx后台管理系统</h3>
        </div>
    </div>
    <!--后台页面小导航-->
    <div class="midNav">
        <div class="link fl">
            <a href="#">首页</a><span>>></span>
            <a href="#">商品管理</a><span>>></span>
            <a href="#">商品修改</a>
        </div>
    </div>
    <!--中部管理-->
    <div class="midManager">
        <div class="LeftManager fl">
            <div class="titleText">管理员</div>
        </div>
        <div class="RightManager fl">
            <div class="titleText">产品管理</div>
        </div>
    </div>
    <div class="midArea">
        <!--左侧导航-->
        <div class="LeftNav fl">
            <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
                <button type="button" class="btn btn-default">商品管理  </button>
                <button type="button" class="btn btn-default">订单管理</button>
                <button type="button" class="btn btn-default">用户信息  </button>
                <button type="button" class="btn btn-default">BUTTON  </button>
                <button type="button" class="btn btn-default">BUTTON  </button>
                <button type="button" class="btn btn-default">BUTTON  </button>
                <button type="button" class="btn btn-default">BUTTON  </button>
            </div>
        </div>
        <!--右侧内容-->
        <div class="RightContent ">
            <!--管理信息提示-->
            <div class="optionTop">
                <div class="fl">
                    <input type="button" name="" id="addinfo" value="添加" />
                </div>
                <div class=" tip fr">
                    <label>商品名称：</label>
                    <select class="dropmenu">
                        <option value="洗衣粉">洗衣粉</option>
                        <option value="毛巾">毛巾</option>
                        <option value="杯子">杯子</option>
                        <option value="方便面">方便面</option>
                    </select>
                    <label>上架时间：</label>
                    <select class="dropmenu">
                        <option value="2016">2016</option>
                        <option value="2017">2017</option>
                        <option value="2008">2008</option>
                        <option value="2009">2009</option>
                    </select>
                    <label>搜索</label>
                    <input type="text" name="" id="" value="" />
                </div>
            </div>
            <!--右侧表格-->
            <div class="optionBottom fr">
                <table class="table  table-bordered">
                    <!--动态显示 -->
                    <thead class="table-info">
                    <!--表头-->
                    <<tr>
                        <th>商品编号</th>
                        <th>名称</th>
                        <th>价格</th>
                        <th>说明</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <!--内容-->
                    <tbody>
                    <c:forEach var="cl" items="${commodityList}">
                    <tr>
                        <td>${cl.commodityId}</td>
                        <td>${cl.name}</td>
                        <td>${cl.commodityValue}</td>
                        <td>${cl.commodityDescribe}</td>
                        <td>
                            <button class="btn btn-info" onclick="InsetShoppingCart(${cl.commodityId})">修改</button>
                            <button class="btn btn-info" onclick="InsetShoppingCart(${cl.commodityId})">删除</button>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
