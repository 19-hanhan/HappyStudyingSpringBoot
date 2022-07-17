$.ajax({
    url: '/admin/oneAdmin',
    type: 'get',
    data: {
        id: GetQueryString("id")
    },
    dataType: 'json',
    success: function (data) {
        $('#updateId').val(data.aId);
        $('#updateEmail').val(data.aEmail);
        $('#updateName').val(data.aName);
    }
})

function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}

$(function () {
    $('#updateSubmitBtn').click(function () {
        var id = $('#updateId').val();
        var name = $('#updateName').val();
        var oldPassword = $('#oldPassword').val();
        var newPassword = $('#newPassword').val();
        var email = $('#updateEmail').val();
        // console.log(id);
        // console.log(email);
        // console.log(name);
        $.ajax({
            url: '/admin/updateAdmin',
            type: 'post',
            data: {
                id: id,
                name: name,
                oldPassword: oldPassword,
                newPassword: newPassword,
                email: email
            },
            dataType: 'text',
            success: function (data) {
                if (data === 'true') {
                    alert('修改成功');
                    window.opener.location.reload();
                    window.close();
                } else {
                    alert('密码错误');
                }
            }
        })
    })
})