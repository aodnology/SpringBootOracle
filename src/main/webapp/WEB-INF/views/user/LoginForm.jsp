<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>로그인 화면</title>

    <script type="text/javascript">

        //로그인을 위한 입력정보의 유효성 체크하기
        function doLoginUserCheck(f) {

            if (f.user_id.value === "") {
                alert("아이디를 입력하세요.");
                f.user_id.focus();
                return false;
            }

            if (f.password.value === "") {
                alert("비밀번호를 입력하세요.");
                f.password.focus();
                return false;
            }

        }
    </script>
    <style>
        .main {
            width: 250px;
            height: 300px;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            border: 1px solid lightgrey;
            border-radius: 5px;
        }

        .logo {
            margin-top: 0px;
            margin-bottom: 40px;
        }

        #login {
            width: 100%;
            background-color: skyblue;
            border-color: transparent;
            color: white;
        }

        .account {
            display: block;
            margin-bottom: 3px;
            padding: 3px;
            border: 1px solid lightgray;
            border-radius: 3px;
        }

        #alert {
            border-color: transparent;
        }
    </style>
</head>
<body>
<h1>로그인 화면</h1>
<br/>
<form name="f" method="post" action="/user/getUserLoginCheck" onsubmit="return doLoginUserCheck(this);">
    <div class="main">
        <h1 class="logo">박수호</h1>
        <div class="container">
            <input type="text" name="user_id" placeholder="ID" id="id" class="account" />
            <input type="password" name ="password" placeholder="Password" id="password" class="account">
            <button id="login" class="account" value="로그인">login</button>
            <p id="alert" class="account"> </p>
        </div>
    </div>
    </div>
</form>
</body>
</html>