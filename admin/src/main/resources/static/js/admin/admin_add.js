$(function () {
    $('#addSubmitBtn').click(function () {
        var email = $('#addEmail').val();
        var password = $('#addPassword').val();
        var name = $('#addName').val();
        $.ajax({
            url: '/admin/addAdmin',
            type: 'post',
            data: {
                email: email,
                password: password,
                name: name
            },
            dataType: 'text',
            success:function (data) {
                if (data === 'true'){
                    alert('添加成功');
                    window.opener.location.reload();
                    window.close();
                } else {
                    alert('添加失败');
                }
            }
        })
    })
})