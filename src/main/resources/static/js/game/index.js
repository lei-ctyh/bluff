layui.use(function () {
    var $ = layui.$;
    var form = layui.form;
    var layer = layui.layer;
    // 提交事件
    form.on('submit(demo-login)', function (data) {
        var field = data.field; // 获取表单字段值
        $.ajax({
            url: "http://localhost:8080/game/login",
            data: JSON.stringify(field),
            type: "post",
            dataType: "json",
            headers: {'Content-Type': 'application/json;charset=utf-8'}, //接口json格式
            success: function (data) {
                console.log(data);
                layer.alert(JSON.stringify(data), {
                    title: data
                });
            },
            error: function (data) {
                console.log(JSON.stringify(data))
            }

        })


        return false; // 阻止默认 form 跳转
    });
});
