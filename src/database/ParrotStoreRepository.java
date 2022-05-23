package database;

import food.Food;
import menu.Item;
import parrots.Parrot;
import toys.Toy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ParrotStoreRepository {

    public void createTables() {
        String create_parrots = "CREATE TABLE IF NOT EXISTS parrots " +
                "(id SERIAL PRIMARY KEY, " +
                "name VARCHAR(50)," +
                "quantity INTEGER)";
        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            statement.execute(create_parrots);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        String create_food = "CREATE TABLE IF NOT EXISTS food " +
                "(id SERIAL PRIMARY KEY, " +
                "name VARCHAR(50)," +
                "quantity INTEGER)";
        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            statement.execute(create_food);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        String create_toys = "CREATE TABLE IF NOT EXISTS toys " +
                "(id SERIAL PRIMARY KEY, " +
                "name VARCHAR(50)," +
                "quantity INTEGER)";
        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            statement.execute(create_toys);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void addParrot(String name, int qty) {
        String sql = "INSERT INTO parrots (name, quantity) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, qty);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void addFood(String name, int qty) {
        String sql = "INSERT INTO food (name, quantity) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, qty);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void addToy(String name, int qty) {
        String sql = "INSERT INTO toys (name, quantity) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, qty);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void dropTables() {
        String drop_parrots = "DROP TABLE IF EXISTS parrots";
        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            statement.execute(drop_parrots);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        String drop_food = "DROP TABLE IF EXISTS food";
        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            statement.execute(drop_food);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        String drop_toys = "DROP TABLE IF EXISTS toys";
        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            statement.execute(drop_toys);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public int getItemCount(Item item) {
        String table = "";
        if(item instanceof Parrot)
            table = "parrots";
        else if(item instanceof Food)
            table = "food";
        else if(item instanceof Toy)
            table = "toys";

        String sql = "SELECT quantity FROM " + table + " WHERE name = '"
                                + item.getName().split(" ")[0] + "'";

        try (Statement statement = DatabaseConnection.getInstance().createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                return resultSet.getInt("quantity");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return 0;
    }

    public void updateQuantity(Item item, int qty) {
        String table = "";
        if(item instanceof Parrot)
            table = "parrots";
        else if(item instanceof Food)
            table = "food";
        else if(item instanceof Toy)
            table = "toys";

        String sql = "UPDATE " + table + " SET quantity = " + qty + " WHERE name = '"
                                            + item.getName().split(" ")[0] + "'";

        try (Statement Statement = DatabaseConnection.getInstance().createStatement()) {
            int affectedrows = Statement.executeUpdate(sql);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
