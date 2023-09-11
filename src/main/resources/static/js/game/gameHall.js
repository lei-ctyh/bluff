layui.use(function () {
    var carousel = layui.carousel;



    // 渲染 - 图片轮播
    carousel.render({
        elem: '#ID-carousel-demo-image',
        full: true,
        interval: 3000,
        anim: 'fade',

    });
});
