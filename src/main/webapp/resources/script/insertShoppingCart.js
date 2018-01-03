//存放加入购物车按钮



function InsertShoppingCart(id,value) {
    $.ajax({
        url:"/User/InsertShoppingCart?Commid=" + id + "&value=" + value,
        type: "post",
        success:function () {
            alert("添加成功！");
        },
        error:function () {
            alert("添加失败！");
        }
    });
}
