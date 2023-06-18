package HomeWorkTwo;


public class Main02 {


    /*1) Дана строка sql-запроса "select * from students where ".
    Сформируйте часть WHERE этого запроса, используя StringBuilder.
    Данные для фильтрации приведены ниже в виде json-строки.
    Если значение null, то параметр не должен попадать в запрос.
    Параметры для фильтрации:
    {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

/*
    public static void main(String[] args) {
        // Данные для фильтрации в виде json-строки
        String filterData = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        // Преобразование json-строки в Map
        Map<String, String> filters = new HashMap<>();
        filters.put("name", "Ivanov");
        filters.put("country", "Russia");
        filters.put("city", "Moscow");
        filters.put("age", "null");

        // Формирование части WHERE с помощью StringBuilder
        StringBuilder whereClause = new StringBuilder("select * from students where ");

        for (Map.Entry<String, String> entry : filters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (value != null && !value.equals("null")) {
                whereClause.append(key).append(" = '").append(value).append("' AND ");
            }
        }

        // Удаление последнего "AND" из строки
        int lastIndex = whereClause.lastIndexOf("AND");
        whereClause.delete(lastIndex, lastIndex + 3);

        System.out.println(whereClause.toString());
    }
}
*/




/*2) Реализуйте алгоритм сортировки пузырьком числового массива,
     результат после каждой итерации запишите в лог-файл.*/

/*

    public static void Logger(String fileName) throws IOException {

        Logger logger = Logger.getLogger(Main02.class.getName());
        FileHandler fh = new FileHandler(fileName);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        logger.log(Level.INFO, "Test log");
        logger.info("Test log2");
    }
    public static void main(String[] args) throws IOException {
        String fileName = "Log2.xml";
        Logger(fileName);

        int[] array = new int[5];
        for (int z = 0; z < 5; z++) {
            array[z] = (int) (Math.random() * 20);
            System.out.print(array[z] + " ");
            int temp;
            for (int i = 1; i < 5; i++) {
                Logger(fileName);
                for (int j = 5 - 1; j >= i; j--) {
                    if (array[j - 1] > array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        System.out.print(array[j] + " ");
                    }
                }
            }
        }
    }
}*/


/*3) Дана json-строка (можно сохранить в файл и читать из файла)
        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
        Пример вывода:
        Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.*/

/*
        public static void JsonWriter(String fileName){
            JSONArray data = new JSONArray();

            JSONObject stud1 = new JSONObject();
            stud1.put("фамилия", "Иванов");
            stud1.put("оценка", "5");
            stud1.put("предмет", "Математика");

            JSONObject stud2 = new JSONObject();
            stud2.put("фамилия", "Петрова");
            stud2.put("оценка", "4");
            stud2.put("предмет", "Информатика");

            JSONObject stud3 = new JSONObject();
            stud3.put("фамилия", "Краснов");
            stud3.put("оценка", "5");
            stud3.put("предмет", "Физика");

            data.put(stud1);
            data.put(stud2);
            data.put(stud3);

            try(FileWriter fileWriter = new FileWriter(fileName)){
                fileWriter.write(data.toString());
                System.out.println("Текст успешно записан в файл : " + "data.json");
                System.out.println(data);
            } catch (IOException e) {
                System.out.println("Ошибка записи :(");
            }
        }
        public static String JsonReader(String fileName){
            StringBuilder stringBuilder = new StringBuilder();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
            } catch (IOException e) {
                System.out.println("Ошибка чтения.....");
            }

            String jsonString = stringBuilder.toString();
            System.out.println(jsonString);
            return jsonString;
        }

        public static void JsonParser(String jsonString){

            JSONArray jsonArray = new JSONArray(jsonString);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject student = jsonArray.getJSONObject(i);
                String surname = student.getString("фамилия");
                String mark = student.getString("оценка");
                String item = student.getString("предмет");
                stringBuilder.append("Студент ").append(surname).append(" получил ").append(mark).append(" по предмету ").append(item).append(".\n");
            }
            System.out.println(stringBuilder.toString());
        }

        public static void main02(String[] args) {
            String fileName = "data.json";
            JsonWriter(fileName);
            String res = JsonReader(fileName);
            System.out.println("\n");
            JsonParser(res);

        }
    }*/
}