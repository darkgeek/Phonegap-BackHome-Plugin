window.BackHome = {
    goHome: function(success, error) {
        cordova.exec(success, error, "BackHome", "goHome", []);
    },
}

module.exports = BackHome;
