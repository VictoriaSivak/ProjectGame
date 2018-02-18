package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Manager {

    public Player setPlayer(Player player) throws IOException {
        System.out.println("GAME STARTED");
        System.out.println("Plese enter your sex: F - female, M - male");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String enteredSex = "";
        do {
            enteredSex = bufferedReader.readLine();
            enteredSex = enteredSex.toUpperCase();
            if (!"M".equals(enteredSex) && !"F".equals(enteredSex)) {
                System.out.println("You entered incorrect value. Please enter correct sex: F - female, M - male");
            }
        } while (!enteredSex.equals("M") && !enteredSex.equals("F"));

        // TODO clear console

        System.out.println("Please enter your name");
        String playerName = bufferedReader.readLine();
        player.setName(playerName);
        player.setSex("M".equals(enteredSex) ? "male" : "female");
        return player;
    }

    public Player setSecondPlayer(Player secondPlayer) throws IOException {
        System.out.println("GAME STARTED");
        System.out.println("Plese enter your sex: F - female, M - male");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String enteredSex = "";
        do {
            enteredSex = bufferedReader.readLine();
            enteredSex = enteredSex.toUpperCase();
            if (!"M".equals(enteredSex) && !"F".equals(enteredSex)) {
                System.out.println("You entered incorrect value. Please enter correct sex: F - female, M - male");
            }
        } while (!enteredSex.equals("M") && !enteredSex.equals("F"));

        // TODO clear console

        System.out.println("Please enter your name");
        String playerName = bufferedReader.readLine();
        secondPlayer.setName(playerName);
        secondPlayer.setSex("M".equals(enteredSex) ? "male" : "female");
        return secondPlayer;
    }


    public static Enigma[] prepareData(){

        Enigma[] enigmas = new Enigma[50];

        String[] answers0 = {"112", "92", "38", "61"};
        enigmas[0] = new Enigma("Скільки країн брали участь у Другій світовій війні?",answers0,3);

        String[] answers1 = {"Швидко", "Стоп", "Повільно", "Тихо"};
        enigmas[1] = new Enigma("Музичний термін “Аллегро” означає:", answers1, 0);

        String[] answers2 = {"Сонце", "Юпітер", "Земля", "Сатурн"};
        enigmas[2] = new Enigma("Яка планета сонячної системи найбільша?", answers2, 1);

        String[] answers3 = {"Монако", "Нігерія", "Ватикан", "Болгарія"};
        enigmas[3] = new Enigma("Найменша країна ...", answers3, 2);

        String[] answers4 = {"Еверес", "Кіліманжаро", "Говерла", "Олімп"};
        enigmas[4] = new Enigma("Яка гора слугувала місцем проживання еллінських богів?", answers4, 3);

        String[] answers5 = {"Тихий", "Атлантичний", "Індійський", "Північний льодовитий"};
        enigmas[5] = new Enigma("В якому океані знаходиться жовте море?", answers5, 0);

        String[] answers6 = {"Москва", "Київ", "Софія", "Тольяті"};
        enigmas[6] = new Enigma("У якому місті випускають автомобілі марки 'Жигулі'?", answers6, 3);

        String[] answers7 = {"Ра", "Зевс", "Сонце", "Дажбог"};
        enigmas[7] = new Enigma("Головний бог інків ...", answers7, 2);

        String[] answers8 = {"Хрестоносці", "Інквізиція", "Мусульмани", "Свідки Єгови"};
        enigmas[8] = new Enigma("Хто винищував єретиків в Іспанії в 15 ст.?", answers8, 1);

        String[] answers9 = {"Читання", "Слухати", "Навчатися", "Засвоювати"};
        enigmas[9] = new Enigma("Як з латині перекладається слово 'Лекція'?", answers9, 0);

        String[] answers10 = {"Воїн", "Вбивця", "Захисник", "Вершник"};
        enigmas[10] = new Enigma("Як перекладається слово 'Лицар'?", answers10, 3);

        String[] answers11 = {"Половці", "Трипільці", "Скіфи", "Монголи"};
        enigmas[11] = new Enigma("Народ, який жив на березі Чорного моря в 6 ст. до н.е. ...", answers11, 2);

        String[] answers12 = {"Кенгуру", "Коала", "Бобер", "Сурок"};
        enigmas[12] = new Enigma("Сумчастий ведмедик - символ Австралії ...", answers12, 1);

        String[] answers13 = {"Кажани", "Коти", "Кроти", "Зайці"};
        enigmas[13] = new Enigma("Тварини, які бачать не очима, а вухами ...", answers13, 0);

        String[] answers14 = {"0", "2", "4", "6"};
        enigmas[14] = new Enigma("Скільки братів у Хлопчика-мізинчика?", answers14,3);

        String[] answers15 = {"1000", "50", "20", "300"};
        enigmas[15] = new Enigma("Скільки років спала Спляча красуня?", answers15,3);

        String[] answers16 = {"Жуль Верн", "Джонатан Свіфт", "Джек Лондон", "Скот Фітсджеральд"};
        enigmas[16] = new Enigma("Хто придумав слово 'Ліліпут'?", answers16, 1);

        String[] answers17 = {"Кок", "Капітан корабля", "Корабельний лікар", "Письменник"};
        enigmas[17] = new Enigma("Професія Гулівера ...", answers17, 2);

        String[] answers18 = {"9", "10", "5", "6"};
        enigmas[18] = new Enigma("Скільки існує арабських цифр?", answers18, 1);

        String[] answers19 = {"Сарвантес", "Едісон", "Майєр", "Стівенсон"};
        enigmas[19] = new Enigma("Автор роману 'Дон Кіхот' ...", answers19, 0);

        String[] answers20 = {"Блискавка", "Хуан", "Росінант", "Яблучко"};
        enigmas[20] = new Enigma("Кличка коня Дон Кіхота ...", answers20, 2);

        String[] answers21 = {"10", "20", "40", "45"};
        enigmas[21] = new Enigma("Скільки років провів на беллюдному острові Робінзон Крузо?", answers21, 1);

        String[] answers22 = {"Шрам", "Муфаса", "Кіготь", "Шер-Хан"};
        enigmas[22] = new Enigma("Як звали тигра із книги Кіплінга про Мауглі?", answers22, 3);

        String[] answers23 = {"Короткий", "Тепло", "Утеплятися", "Довгий"};
        enigmas[23] = new Enigma("У перекладі з латині слово 'Куртка' означає ...", answers23, 0);

        String[] answers24 = {"2", "3", "4", "5"};
        enigmas[24] = new Enigma("Скільки груп інструментів включає симфонічний оркестр?", answers24, 1);

        String[] answers25 = {"Австрія", "Нідерланди", "Германія", "Бельгія"};
        enigmas[25] = new Enigma("Де народився Йоган Себастьян Бах?", answers25, 2);

        String[] answers26 = {"4", "5", "6", "7"};
        enigmas[26] = new Enigma("Скільки ліній у нотному стані?", answers26, 1);

        String[] answers27 = {"Діез", "Бекар", "Сінкопа", "Бемоль"};
        enigmas[27] = new Enigma("Знак пониження звуку ...", answers27, 3);

        String[] answers28 = {"Платон", "Архімед", "Сократ", "Цицерон"};
        enigmas[28] = new Enigma("Видатний давньогрецький учений із Сиракуз ...", answers28, 1);

        String[] answers29 = {"Діоген", "Конфуцій", "Ксенофонт", "Арістотель"};
        enigmas[29] = new Enigma("Філософ, який жив у бочці ...", answers29, 0);

        String[] answers30 = {"Ейнштейн", "Едісон", "Дарвін", "Коперник"};
        enigmas[30] = new Enigma("Учений, який довів походження людини від мавпи ...", answers30, 2);

        String[] answers31 = {"Угорщина", "Росія", "Україна", "Польща"};
        enigmas[31] = new Enigma("У якій країні народився Миколай Коперник?", answers31, 3);

        String[] answers32 = {"Ватт", "Морзе", "Вітсон", "Кастальді"};
        enigmas[32] = new Enigma("Винахідник азбуки, за допомогою якої працює телеграф ...", answers32, 1);

        String[] answers33 = {"Геометрія", "Алгебра", "Фізика", "Хімія"};
        enigmas[33] = new Enigma("Ньютон основоположник науки ...", answers33, 2);

        String[] answers34 = {"Чайник", "Мікрохвильва піч", "Посудомийка", "Кухонний комбайн"};
        enigmas[34] = new Enigma("Винахід американського інженера П. Спансера, який широко застосовується на кухні ...", answers34, 1);

        String[] answers35 = {"Літографія", "Пейнтографія", "Карбування", "Гравюра"};
        enigmas[35] = new Enigma("Гравюра на камінні ...", answers35, 0);

        String[] answers36 = {"Квітка", "Пензель", "Тичинка", "Пелюстка"};
        enigmas[36] = new Enigma("Як називається суцвіття конвалії?", answers36, 1);

        String[] answers37 = {"Одноклітинні", "Багатоклітинні", "Гриби", "Бактерії"};
        enigmas[37] = new Enigma("До якого царства відносяться дріжджі?", answers37, 2);

        String[] answers38 = {"Ідія", "Японія", "Єгипет", "Китай"};
        enigmas[38] = new Enigma("Батьківщина сої ...", answers38, 3);

        String[] answers39 = {"Індія", "Японія", "Єгипет", "Китай"};
        enigmas[39] = new Enigma("Батьківщина риса ...", answers39, 0);

        String[] answers40 = {"Так", "Ні", "Тільки глибоководні", "Тільки риби-ссавці"};
        enigmas[40] = new Enigma("Чи кашляють риби?", answers40, 0);

        String[] answers41 = {"Бук", "Сосна", "Секвоя", "Дуб"};
        enigmas[41] = new Enigma("Деревина якого дерева використовується в суднобудівництві?",answers41, 1);

        String[] answers42 = {"Лазня", "Сад", "Бібліотека", "Берег Нілу"};
        enigmas[42] = new Enigma("Єгипетський фараон Рамзес 13-й користувався завжди аптекою для душі. Що було для нього цією аптекою?",
                answers42, 2);

        String[] answers43 = {"Канада", "Фіндяндія", "Ісландія", "Гренландія"};
        enigmas[43] = new Enigma("Цю країну називають “Землею тисячі озер і опівнічного сонця”...", answers43, 1);

        String[] answers44 = {"Павук", "Муха", "Сороконіжка", "Бджола"};
        enigmas[44] = new Enigma("Комаха, яка має 5 очей ...", answers44, 3);

        String[] answers45 = {"Ямайка", "Гаваї", "Куба", "Мадагаскар"};
        enigmas[45] = new Enigma("Острів свободи", answers45, 2);

        String[] answers46 = {"Англія", "Венеція", "Канада", "Росія"};
        enigmas[46] = new Enigma("Столиця якої держави перекладається як «Фортеця на болоті»?", answers46, 0);

        String[] answers47 = {"Арес", "Прометей", "Аїд", "Зевс"};
        enigmas[47] = new Enigma("Легендирний титан, який приніс людям вогонь ...", answers47, 1);

        String[] answers48 = {"Археолог", "Історик", "Антиквар", "Геолог"};
        enigmas[48] = new Enigma("Любитель, знавець стародавностей, торговець стародавніми предметами, збирач.", answers48, 2);

        String[] answers49 = {"Червоне", "Мертве", "Карибське", "Саргасове"};
        enigmas[49] = new Enigma("Море без берегів ...", answers49, 3);

        return enigmas;
    }
    /**
     * Returns Enigma instance from the array.
     * @param array array of Enigma objects
     * @return Enigma instance
     */
    public Enigma getRandomEnigma(Enigma[] array) {

        int enigmaIndex = (int) (Math.random() * 50) - 1;
        Enigma enigma = array[enigmaIndex];
        return enigma;
    }

}
