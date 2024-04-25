package CollectionManager.Commands;

import java.util.LinkedHashSet;
import Model.SpaceMarine;

public interface Command {  // Интрефейс для команд которые ничего не принимают на вход
    public String execute(LinkedHashSet<SpaceMarine> collection);
}
