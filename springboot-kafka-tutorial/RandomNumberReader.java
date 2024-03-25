import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class RandomNumberReader {

    private int parquimetros;
    private int viaVerde;
    private int iParque;

    public static void main(String[] args) {
        RandomNumberReader reader = new RandomNumberReader();
        reader.startFetching();
    }

    public void startFetching() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                fetchData();
                System.out.println("parquimetros: " + parquimetros);
                System.out.println("viaVerde: " + viaVerde);
                System.out.println("iParque: " + iParque);
                System.out.println("------");
            }
        }, 0, 1 * 60 * 1000); // Fetch data every 5 minutes
    }

    private void fetchData() {
        try {
            URL url = new URL("https://www.randomnumberapi.com/api/v1.0/random?min=50&max=350&count=3");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                parseJson(response.toString());
            } else {
                System.out.println("Failed to fetch data. HTTP response code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void parseJson(String json) {
        JSONArray jsonArray = new JSONArray(json);
        if (jsonArray.length() >= 3) {
            parquimetros = jsonArray.getInt(0);
            viaVerde = jsonArray.getInt(1);
            iParque = jsonArray.getInt(2);
        } else {
            System.out.println("Invalid JSON format: " + json);
        }
    }
}
