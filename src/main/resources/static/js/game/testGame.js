$(document).ready(function () {
    $("#deal-cards-but").click(function () {
        /*
        红心 hearts /hɑrts/ (♥)
        黑桃 spades /speɪdz/ (♠)
        方片 diamonds /ˈdaɪəmənd/ (♦)
        梅花 clubs /klʌbz/ (♣)
        */

        // 初始化数组
        let hand = [];
        let suits = ['h', 's', 'd', 'c'];
        let nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];
        nums.forEach(num => {
            suits.forEach(suit => {
                let poker = {
                    num,
                    suit
                };
                hand.push(poker);
            })
        })
        debugger
        $("#hand-area").append("追加文本");
        hand.forEach(poker => {

        })

    });

});



