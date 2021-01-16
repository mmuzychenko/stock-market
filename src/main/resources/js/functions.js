;(function () {
    let raits = document.getElementById('raits');

    let signIn = document.getElementById('sign-in');
    let closeIn = document.getElementById('close-in');
    let signUp = document.getElementById('sign-up');
    let closeUp = document.getElementById('close-up');
    let authAction = document.getElementById('authAction');
    let regAction = document.getElementById('registration');
    let help = document.getElementById('help');
    let closeHelp = document.getElementById('close-help');
    let okHelp = document.getElementById('ok-help');
    
    let mainBtn = document.getElementById('main-btn');
    let currencyBtn = document.getElementById('currency');
    let commoditiesBtn = document.getElementById('commodities');
    let sharesBtn = document.getElementById('shares');
    let indexesBtn = document.getElementById('indexes');

     let contentOutput = document.getElementById('content');
    // let httpRequest;


    hideWindow("login-form");
    hideWindow("registration-form");
    hideWindow("help-me");

    raits.innerHTML = " Dow 30\t23,328.84\t23,201.78\t+0.71%\t0:02:00\n" +
        "S&P 500\t2,575.44\t2,567.56\t+0.51%\t20/10\n" +
        "Russell 2000\t1,514.35\t1,509.90\t+0.43%\t20/10\n" +
        "DAX\t13,063.57\t12,956.42\t+0.01%\t20/10\n" +
        "FTSE 100\t7,560.04\t7,517.07\t+-0.05%\t20/10\n" +
        "CAC 40\t5,392.09\t5,368.21\t+0.08%\t20/10\n" +
        "Euro Stoxx 50\t3,617.52\t3,600.05\t+0.06%\t20/10\n" +
        "AEX\t546.45\t543.82\t+0.01%\t20/10\n" +
        "IBEX 35\t10,249.00\t10,176.50\t+0.25%\t20/10\n" +
        "FTSE MIB\t22,362.23\t22,165.70\t+0.97%\t20/10\n" +
        "SMI\t9,279.08\t9,213.76\t+0.04%\t20/10\n" +
        "Nikkei 225\t21,489.26\t21,363.10\t+0.04%\t20/10\n" +
        "Hang Seng\t28,519.76\t28,313.70\t+1.17%\t20/10\n" +
        "S&P/ASX 200\t5,924.90\t5,868.60\t+0.18%\t20/10\n" +
        "    USD/RUB\t57.4945\t57.6345\t57.2725\t+0.39%\t20/10\n" +
        " USD/UAH\t26.5400\t26.5500\t26.4550\t+0.11%\t20/10\n" +
        " EUR/USD\t1.1784\t1.1858\t1.1763\t-0.57%\t20/10\n" +
        " USD/JPY\t113.53\t113.57\t112.52\t+0.88%\t20/10\n" +
        " GBP/USD\t1.3186\t1.3201\t1.3088\t+0.21%\t20/10\n" +
        " USD/CHF\t0.9843\t0.9853\t0.9757\t+0.81%\t20/10\n" +
        " USD/CAD\t1.2628\t1.2630\t1.2477\t+1.15%\t20/10\n" +
        " AUD/USD\t0.7819\t0.7882\t0.7809\t-0.76%\t20/10\n" +
        " NZD/USD\t0.6960\t0.7037\t0.6955\t-0.97%\t20/10\n" +
        " USD/SGD\t1.3625\t1.3625\t1.3562\t+0.43%\t20/10\n" +
        " USD/HKD\t7.8049\t7.8049\t7.8000\t+0.05%\t20/10\n" +
        " USD/DKK\t6.3162\t6.3277\t6.2773\t+0.58%\t20/10";


    signIn.addEventListener('click', function () {
        showWindow("login-form")
    });
    signUp.addEventListener('click', function () {
        showWindow("registration-form")
    });

    closeIn.addEventListener('click', function () {
        hideWindow('login-form')
    });
    closeUp.addEventListener('click', function () {
        hideWindow('registration-form')
    });
    help.addEventListener('click', function () {
        showWindow('help-me');
    });
    closeHelp.addEventListener('click', function () {
        hideWindow('help-me');
    });
    okHelp.addEventListener('click', function () {
        hideWindow('help-me');
    });

    // mainBtn.addEventListener('click', function () {
    //     //makeRequest();
    //     document.getElementById('content-container').innerHTML = httpRequest.responseText;
    // })



    authAction.addEventListener('click', loginTry);
    regAction.addEventListener('click', registerTry);

    currencyBtn.addEventListener('click', function () {
         sendRequest('GET', 'http://localhost:8080/race');
        //sendRequest('GET', 'https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5');
        // contentOutput.innerHTML = "Server not found!";
        // document.getElementById('content').innerHTML = "YES";
    });

    commoditiesBtn.addEventListener('click', function () {
        contentOutput.innerHTML = "";
    });

    sharesBtn.addEventListener('click', function () {
        contentOutput.innerHTML = "";
    });

    indexesBtn.addEventListener('click', function () {
        contentOutput.innerHTML = "";
    });


    function showWindow(windowId) {
        document.getElementById(windowId).style.display = "block";
    }

    function hideWindow(windowId) {
        document.getElementById(windowId).style.display = 'none';
    }

    function loginTry() {

        if (document.getElementById('username').value !== '') {
            if (document.getElementById('password').value !== '') {
                hideWindow("login-form"); // send to server
            } else {
                document.getElementById('loginResult').innerHTML = 'You did not enter your password.'
            }
        } else {
            document.getElementById('loginResult').innerHTML = 'You did not enter your username.'
        }
    }

    function registerTry() {

        let pwd = document.getElementById('reg-pwd').value;
        let pwd2 = document.getElementById('reg-dub-pwd').value;

        if (document.getElementById('reg-username').value !== '') {
            if (document.getElementById('reg-email').value !== '') {
                if (pwd !== '') {
                    if (pwd2 !== '') {
                        if (pwd === pwd2) {
                            hideWindow("registration-form"); // send to server
                        } else {
                            document.getElementById('regResult').innerHTML = 'Passwords are not match.'
                        }
                    } else {
                        document.getElementById('regResult').innerHTML = 'You did not enter your password.'
                    }
                } else {
                    document.getElementById('regResult').innerHTML = 'You did not enter your password.'
                }
            } else {
                document.getElementById('regResult').innerHTML = 'You did not enter email.'
            }
        } else {
            document.getElementById('regResult').innerHTML = 'You did not enter your username.'
        }
    }

    function sendRequest(method, url) {
        var xhttp = new XMLHttpRequest();
        xhttp.withCredentials = true;
        xhttp.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
                contentOutput.innerHTML = this.response;
            } else {
                contentOutput.innerHTML = "Server not found!";
            }
        };
        xhttp.open(method, url, true);
        xhttp.send();
    }

    // $.ajax({
    //     url:"",
    //     context: document.body
    // }).done(function () {
    //
    // })






}());




