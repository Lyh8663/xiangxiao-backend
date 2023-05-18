// index.js
Page({
    onShow:function(){
        setTimeout(function () {
           
            wx.redirectTo({
              url: '../index/index',
            })
            }, 3000)
    }
})
