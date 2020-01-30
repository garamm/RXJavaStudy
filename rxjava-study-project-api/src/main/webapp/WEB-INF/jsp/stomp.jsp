<body>
    <h1>Chatting Page</h1>
    <div>
        <input type="button" id="chattinglistbtn" value="채팅 참여자 리스트">
        <input type="button" id="outroom" value="채팅방 나가기">
    </div>
    <br>
    <div>
        <textarea id="chatOutput" name="" class="chatting_history" rows="30" cols="70"></textarea>
        <div class='chatting_input'>
            <input id="chatInput" type="text" class="chat">&nbsp
            <input type="button" id="sendBtn" value="전송">
        </div>
    </div>
    <input type="hidden" value="${userid}" id="sessionuserid">
</body>

<script type="text/javascript">
document.addEventListener("DOMContentLoaded", function() {
    WebSocket.init();
});

function connect() {
    var socket = new SockJS("/websockethandler");
    stompClient = Stomp.over(socket);

    stompClient.connect({}, function() {
        stompClient.subscribe("/topic/roomId", function(msg) {
            printMessage(JSON.parse(msg.body).sendMessage + "/" +JSON.parse(msg.body).senderName);
        });
        stompClient.subscribe("/topic/out", function(msg) {
            printMessage(JSON.parse(msg.body);
        });
        stompClient.subscribe("/topic/in", function(msg) {
            printMessage(JSON.parse(msg.body);
        });

        stompClient.send("/app/in", {}, usersessionid.value + " is in chatroom");

    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.send("/app/out", {}, usersessionid.value + " is out chatroom");
        stompClient.disconnect();
    }
}

function sendMessage(text) {
    stompClient.send("/app/hello", {}, JSON.stringify({"sendMessage":text, "senderName":""+usersessionid.value}));
}
</script>