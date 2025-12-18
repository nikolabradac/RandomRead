package com.example.randomwords;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private WebView webView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        // Load HTML content directly
        String htmlContent = "<!DOCTYPE html>\n" +
                "<html lang=\"hr\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Nasumične Riječi</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            display: flex;\n" +
                "            justify-content: center;\n" +
                "            align-items: center;\n" +
                "            min-height: 100vh;\n" +
                "            margin: 0;\n" +
                "            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n" +
                "        }\n" +
                "        \n" +
                "        .container {\n" +
                "            background: white;\n" +
                "            padding: 40px;\n" +
                "            border-radius: 15px;\n" +
                "            box-shadow: 0 10px 40px rgba(0, 0, 0, 0.2);\n" +
                "            text-align: center;\n" +
                "            min-width: 300px;\n" +
                "        }\n" +
                "        \n" +
                "        h1 {\n" +
                "            color: #333;\n" +
                "            margin-bottom: 30px;\n" +
                "        }\n" +
                "        \n" +
                "        #wordDisplay {\n" +
                "            font-size: 48px;\n" +
                "            font-weight: bold;\n" +
                "            color: #667eea;\n" +
                "            margin: 30px 0;\n" +
                "            min-height: 60px;\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "        }\n" +
                "        \n" +
                "        button {\n" +
                "            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n" +
                "            color: white;\n" +
                "            border: none;\n" +
                "            padding: 12px 30px;\n" +
                "            font-size: 16px;\n" +
                "            border-radius: 25px;\n" +
                "            cursor: pointer;\n" +
                "            transition: transform 0.2s, box-shadow 0.2s;\n" +
                "        }\n" +
                "        \n" +
                "        button:hover {\n" +
                "            transform: translateY(-2px);\n" +
                "            box-shadow: 0 5px 20px rgba(102, 126, 234, 0.4);\n" +
                "        }\n" +
                "        \n" +
                "        button:active {\n" +
                "            transform: translateY(0);\n" +
                "        }\n" +
                "        \n" +
                "        .length-selector {\n" +
                "            margin: 20px 0;\n" +
                "            display: flex;\n" +
                "            justify-content: center;\n" +
                "            gap: 15px;\n" +
                "            flex-wrap: wrap;\n" +
                "        }\n" +
                "        \n" +
                "        .length-option {\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            gap: 5px;\n" +
                "            cursor: pointer;\n" +
                "        }\n" +
                "        \n" +
                "        .length-option input[type=\\\"radio\\\"] {\n" +
                "            cursor: pointer;\n" +
                "            width: 18px;\n" +
                "            height: 18px;\n" +
                "        }\n" +
                "        \n" +
                "        .length-option label {\n" +
                "            cursor: pointer;\n" +
                "            font-size: 16px;\n" +
                "            color: #333;\n" +
                "        }\n" +
                "        \n" +
                "        .space-option {\n" +
                "            margin: 15px 0;\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "            gap: 8px;\n" +
                "        }\n" +
                "        \n" +
                "        .space-option input[type=\\\"checkbox\\\"] {\n" +
                "            cursor: pointer;\n" +
                "            width: 18px;\n" +
                "            height: 18px;\n" +
                "        }\n" +
                "        \n" +
                "        .space-option label {\n" +
                "            cursor: pointer;\n" +
                "            font-size: 16px;\n" +
                "            color: #333;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\\\"container\\\">\n" +
                "        <h1>Nasumične Riječi</h1>\n" +
                "        \n" +
                "        <div class=\\\"length-selector\\\">\n" +
                "            <div class=\\\"length-option\\\">\n" +
                "                <input type=\\\"radio\\\" id=\\\"length2\\\" name=\\\"wordLength\\\" value=\\\"2\\\">\n" +
                "                <label for=\\\"length2\\\">2 slova</label>\n" +
                "            </div>\n" +
                "            <div class=\\\"length-option\\\">\n" +
                "                <input type=\\\"radio\\\" id=\\\"length3\\\" name=\\\"wordLength\\\" value=\\\"3\\\" checked>\n" +
                "                <label for=\\\"length3\\\">3 slova</label>\n" +
                "            </div>\n" +
                "            <div class=\\\"length-option\\\">\n" +
                "                <input type=\\\"radio\\\" id=\\\"length4\\\" name=\\\"wordLength\\\" value=\\\"4\\\">\n" +
                "                <label for=\\\"length4\\\">4 slova</label>\n" +
                "            </div>\n" +
                "            <div class=\\\"length-option\\\">\n" +
                "                <input type=\\\"radio\\\" id=\\\"length5\\\" name=\\\"wordLength\\\" value=\\\"5\\\">\n" +
                "                <label for=\\\"length5\\\">5 slova</label>\n" +
                "            </div>\n" +
                "            <div class=\\\"length-option\\\">\n" +
                "                <input type=\\\"radio\\\" id=\\\"length6\\\" name=\\\"wordLength\\\" value=\\\"6\\\">\n" +
                "                <label for=\\\"length6\\\">6 slova</label>\n" +
                "            </div>\n" +
                "            <div class=\\\"length-option\\\">\n" +
                "                <input type=\\\"radio\\\" id=\\\"length7\\\" name=\\\"wordLength\\\" value=\\\"7\\\">\n" +
                "                <label for=\\\"length7\\\">7 slova</label>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        \n" +
                "        <div class=\\\"space-option\\\">\n" +
                "            <input type=\\\"checkbox\\\" id=\\\"randomSpace\\\" name=\\\"randomSpace\\\">\n" +
                "            <label for=\\\"randomSpace\\\">Razmak nakon slučajnog slova</label>\n" +
                "        </div>\n" +
                "        \n" +
                "        <div id=\\\"wordDisplay\\\">Klikni za generiranje</div>\n" +
                "        <button onclick=\\\"generateWord()\\\">Generiraj Riječ</button>\n" +
                "    </div>\n" +
                "\n" +
                "    <script>\n" +
                "        function generateWord() {\n" +
                "            const consonants = 'bcčćdđfghjklmnprsštvzž';\n" +
                "            const vowels = 'aeiou';\n" +
                "            \n" +
                "            const selectedLength = parseInt(document.querySelector('input[name=\\\"wordLength\\\"]:checked').value);\n" +
                "            \n" +
                "            let word = '';\n" +
                "            \n" +
                "            for (let i = 0; i < selectedLength; i++) {\n" +
                "                if (i % 2 === 0) {\n" +
                "                    word += consonants[Math.floor(Math.random() * consonants.length)];\n" +
                "                } else {\n" +
                "                    word += vowels[Math.floor(Math.random() * vowels.length)];\n" +
                "                }\n" +
                "            }\n" +
                "            \n" +
                "            let displayWord = word.toUpperCase();\n" +
                "            const useRandomSpace = document.getElementById('randomSpace').checked;\n" +
                "            \n" +
                "            if (displayWord.length > 2) {\n" +
                "                if (useRandomSpace) {\n" +
                "                    const randomPos = Math.floor(Math.random() * (displayWord.length - 1)) + 1;\n" +
                "                    displayWord = displayWord.slice(0, randomPos) + ' ' + displayWord.slice(randomPos);\n" +
                "                } else {\n" +
                "                    displayWord = displayWord.slice(0, 2) + ' ' + displayWord.slice(2);\n" +
                "                    \n" +
                "                    if (displayWord.length > 5) {\n" +
                "                        displayWord = displayWord.slice(0, 5) + ' ' + displayWord.slice(5);\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "            \n" +
                "            document.getElementById('wordDisplay').textContent = displayWord;\n" +
                "        }\n" +
                "        \n" +
                "        window.onload = generateWord;\n" +
                "    </script>\n" +
                "</body>\n" +
                "</html>";
        
        webView.loadDataWithBaseURL(null, htmlContent, "text/html", "UTF-8", null);
    }
}
