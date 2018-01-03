
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <jsp:include page="common/head.jsp"/>
</head>
<body>
    <%--页面显示部分--%>
    <div class="container">
        <div class="panel panel-default">
            <div class="page-header text-center">
                <h2>商品页面</h2>
            </div>
            <div class="panel-body">
                <table align='center' border='1' cellspacing='0' class="table table-hover">
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
                <div style="text-align:center">
                    <a href="?start=0">首  页</a>
                    <a href="?start=${page.start-page.count}">上一页</a>
                    <a href="?start=${page.start+page.count}">下一页</a>
                    <a href="?start=${page.last}">末  页</a>
                </div>
            </div>
        </div>
    </div>
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
            success:function () {
                alert("添加成功！");
            },
            error:function () {
                alert("添加失败！");
            }
        });
    }
</script>

</html>
