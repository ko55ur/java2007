package course3.homework6.chat.client;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class HistoryAdd {
    private static final int SIZE_OF_RETRIEVED_HISTORY = 100;
    private static final String HISTORY_PATH = "course3/homework6/chat/client/history";
    private final String login;
    private final File history;

    public HistoryAdd(String login) {
        this.login = login;
        this.history = new File(HISTORY_PATH + "history_" + login + ".txt");
        if (!history.exists()) {
            File path = new File(HISTORY_PATH);
            path.mkdirs();
        }
    }

    public List<String> readHistory() {
        if (!history.exists()) return Collections.singletonList("No previous history");
        List<String> result = null;
        if (history.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(history))) {
                String historyString;
                List<String> historyStrings = new ArrayList<>();
                while ((historyString = reader.readLine()) != null) {
                    historyStrings.add(historyString);
                }
                if (historyStrings.size() <= SIZE_OF_RETRIEVED_HISTORY) {
                    result = historyStrings;
                }
                if (historyStrings.size() > SIZE_OF_RETRIEVED_HISTORY) {
                    int firstIndex = historyStrings.size() - SIZE_OF_RETRIEVED_HISTORY;
                    result = new ArrayList<>(SIZE_OF_RETRIEVED_HISTORY);

                    for (int counter = firstIndex - 1; counter < historyStrings.size(); counter++) {
                        result.add(historyStrings.get(counter));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("History for " + result.size());
        return result;
    }

    public void writeHistory(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(history, true))) {
            writer.write(new Date() + " " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

