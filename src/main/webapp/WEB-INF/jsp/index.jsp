<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="common/head.jsp"/>
</head>
<body>
<!--导航-->
<div class="headerBar">
    <!--顶部导航-->
    <div class="topBar">
        <div class="comWidth">
            <div class="leftArea">
                <a href="#" class="collection">收藏网页</a>
            </div>
            <div class="rightArea">
                欢迎来到该网页！<a href="/login">[登录]</a><a href="/register">[免费注册]</a>
            </div>
        </div>
    </div>
    <!--logo导航-->
    <div class="logoBar">
        <div class="comWidth">
            <div class="CLeft">
                <div class="logo">
                    <a href="#"><img src="shopclass/logo.jpg" alt="电商网"></a>
                </div>
            </div>
            <div class="CRight">
                <div class="search_box">
                    <input type="text" class="search_text">
                    <input type="button" value="搜 索" class="search_btn">
                </div>
                <div class="shopCar">
                    <span class="shopText"><a href="/ShoppingCart/index">购物车</a></span>
                </div>
            </div>
        </div>
    </div>

    <!--内容导航-->
    <div class="contentBar">
        <ul>
            <li class="nav">全部商品分类</li>
            <li><a href="#" class="active">数码城</a></li>
            <li><a href="#">天猫</a></li>
            <li><a href="#">团购</a></li>
            <li><a href="#">发现</a></li>
            <li><a href="#">二手折卖</a></li>
            <li><a href="#">唯品会</a></li>
        </ul>

    </div>

</div>

<!--正文内容-->
<div class="midcontent">
    <div class="container">
        <!--左边留白 做导航 //TODO-->
        <div class="col-md-1"></div>
        <!--中间物品内容-->
        <div class="col-md-6">
            <div class="container">
                <div class="panel panel-default">
                    <div class="page-header text-center">
                        <h2>商品页面</h2>
                    </div>
                    <div class="panel-body">
                        <table class="table table-hover table-striped">
                            <thead>
                            <tr>
                                <th>商品编号</th>
                                <th>名称</th>
                                <th>价格</th>
                                <th>说明</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="cl" items="${commodityList}">
                                <tr>
                                    <td>${cl.commodityId}</td>
                                    <td>${cl.name}</td>
                                    <td>${cl.commodityValue}</td>
                                    <td>${cl.commodityDescribe}</td>
                                    <td>
                                        <button class="btn btn-info" onclick="InsetShoppingCart(${cl.commodityId})">加入购物车</button>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!--右边购物车留白-->
        <div class="col-md-5">
            <div class="container">
                <div class="panel panel-default">
                    <div class="page-header text-center">
                        <h2>购物车页面</h2>
                    </div>
                    <div class="panel-body">

                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>商品名称</th>
                                    <th>数量</th>
                                    <th>单价</th>
                                    <th>总价格</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="scl" items="${shoppingCartList}">
                                    <tr>
                                        <td>${scl.commodityName}</td>
                                        <td>${scl.count}</td>
                                        <td>${scl.commodityValue}</td>
                                        <td>${scl.values}</td>
                                        <td>
                                            <button class="btn btn-info" onclick="insertOrder(${cl.commodityId})">购买</button>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>

                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<!--底部链接-->
<div class="footer">
    <div class="bottomcontent">
        <p>
            <a href="#">网站简介</a><i>|</i>
            <a href="#">网站公告</a><i>|</i>
            <a href="#">招纳贤士</a><i>|</i>
            <a href="#">联系我们</a><i>|</i>
            客服热线：400-675-1234
        </p>
        <p>
            Copyright ? 2016 - 2018 xx版权所有&nbsp;&nbsp;&nbsp;
            京ICP备09037834号&nbsp;&nbsp;&nbsp;
            京ICP证B1034-8373号&nbsp;&nbsp;&nbsp;
            某市公安局XX分局备案编号：123456789123
        </p>
        <p class="web">
            <a href="#"><img src="shopclass/webLogo.jpg" alt="logo"></a>
            <a href="#"><img src="shopclass/webLogo.jpg" alt="logo"></a>
            <a href="#"><img src="shopclass/webLogo.jpg" alt="logo"></a>
            <a href="#"><img src="shopclass/webLogo.jpg" alt="logo"></a>
        </p>
    </div>
</div>
<style type="text/css">
    body{
        font-size: 12px;
    }
    .topBar{
        height: 31px;
        background-color: #F7F7F7;
        line-height: 31px;
    }
    .leftArea{
        float: left;
        position: relative;
        /*left: 157px;*/
        left: 12%;
        font-weight: bold;
    }
    .rightArea{
        float: right;
        position: relative;
        right: 12%;
    }
    .topBar a{
        color: #656565;
    }
    .topBar a:hover{
        color: red;
        text-decoration: none;
    }
    .logoBar{
        height: 85px;
        background-color: #1D7AD9;
    }
    .CLeft{
        float: left;
        position: relative;
        left: 157px;
    }
    .CRight{
        float: right;
        position: relative;
        right: 300px;
    }
    .search_box{
        float: left;
        margin-right: 40px;
    }
    .CRight{
        margin-top: 24px;
    }
    .search_text{
        width: 350px;
        height: 35px;
        border-style: none;
    }
    .search_btn{
        width: 70px;
        position: relative;
        top: 1px;
        left: -4px;
    }
    .shopCar{
        float: right;
        width: 85px;
        line-height: 35px;
        text-align: right;
        background:url(shopclass/shaoIcon.jpg) 5px center no-repeat;
    }
    .shopText{
        text-align: right;
        height: 35px;
        text-indent: 40px;
    }
    .search_btn,.shopCar{
        background-color: #FF8C00;
        border-style: none;
        color: #ffffff;
        font-size: 14px;
        font-family: "Microsoft YaHei", "微软雅黑";
        height: 35px;
    }
    .contentBar{
        height: 35px;
        background-color: #1369C0;
    }
    .contentBar ul, .contentBar li{
        list-style-type: none;
        margin: 0px;
        padding: 0px;
    }
    .contentBar  li{
        float: left;
        line-height: 35px;
        position: relative;
        left: 157px;
    }
    li.nav{
        color: #FFFFFF;
        font-size: 14px;
        font-weight: bold;
        margin-right: 40px;
    }
    .contentBar a{
        display: inline-block;
        padding: 0 35px;
        color: #FFF;
    }
    a.active{
        background-color: #4593FD;
    }
    .midcontent{
        width: 100%;
        height: 800px;
        background: #ffffff;
    }
    .footer{
        background-color: #D4D4D4;
        height: 235px;
    }
    .bottomcontent{
        padding-top: 50px;
        text-align: center;
        line-height: 24px;
    }
    .bottomcontent a{
        color: black;
    }
    .bottomcontent a:hover{
        color: #FF7300;
        text-decoration: none;
    }
    .bottomcontent img{
        margin-left: 10px;
    }
</style>
</body>

<script src="https://cdn.bootcss.com/jquery/2.2.3/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%--交互逻辑--%>
<script>
    function InsetShoppingCart(commodityId) {
        $.ajax({
            url:"/ShoppingCart/insert?commodityId=" + commodityId,
            type: "post",
            success:function (result) {
                if (result == "success") {
                    alert("添加成功！");
                } else {
                    alert("请登录!");
                }
            },
            error:function () {
                alert("添加失败！");
            }
        });
    }
</script>
</html>

















