$.ajax({
    url: '/user/oneUser',
    type: 'get',
    data: {
        id: GetQueryString("id")
    },
    dataType: 'json',
    success: function (data) {
        console.log(JSON.stringify(data))
        $('#updateId').val(data.uId);
        $('#updateEmail').val(data.uEmail);
        $('#updateName').val(data.uName);
        $('#updateNo').val(data.uNo)
    }
})

function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}

$(function () {
    $('#addSubmitBtn').click(function () {
        var id = $('#updateId').val();
        var name = $('#updateName').val();
        var email = $('#updateEmail').val();
        var oldPassword = $('#oldPassword').val();
        var newPassword = $('#newPassword').val();
        var no = $('#updateNo').val();
        $.ajax({
            url: '/user/updateUser',
            type: 'post',
            data: {
                id: id,
                name: name,
                email: email,
                oldPassword: oldPassword,
                newPassword: newPassword,
                no: no
            },
            dataType: 'text',
            success:function (data) {
                if (data === 'true'){
                    alert('修改成功');
                    window.opener.location.reload();
                    window.close();
                } else {
                    alert('修改失败');
                }
            }
        })
    })
})