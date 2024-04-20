public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

                int apels = 100;
                System.out.println("в коробке " + apels + " кг яблок");
                byte balls = 126;
                System.out.println("в магазине " + balls + " шаров " );
                short trees = 31657;
                System.out.println("в лесу " + trees + " девевьев ");
                long stars = 9135354365894549L;
                System.out.println("на небе " + stars + " звезд ");
                float milk = 0.9f;
                System.out.println("в упаковке " + milk + " литров молока ");
                double pi = 3.14159265358979;
                System.out.println("число П " + pi + " много знаков после запятой  ");

                float one = 27.12f;
                long two = 987678965549L;
                double three = 2.786;
                int four = 569;
                short five = -159;
                short six = 27897;
                byte seven = 67;

                var a = 23;
                var b = 27;
                var c = 30;
                var paper = 480;
                var abc = a + b + c;
                var paperAbc = paper / abc;
                System.out.println("на каждого ученика рассчитано " + paperAbc + " листов бумаги ");

                byte twoMinutes = 16;
                short twentyMinutes = (short) (twoMinutes * (20/2));
                System.out.println("за 20 минут машина произвела " + twentyMinutes + " штук бутылок ");
                int oneDey = twentyMinutes * (24*60/2);
                System.out.println("за сутки машина произвела " + oneDey + " штук бутылок ");
                int threeDay = oneDey * 3;
                System.out.println("за 3 дня машина произвела " + threeDay + " штук бутыок ");
                long month = oneDey * 30L;
                System.out.println("за месяц машина произвела " + month + " штук бутылок ");

                byte paint = 120;
                byte paintOneClass = 6;
                byte allClass = (byte) (paint / paintOneClass);
                byte whitePaint = 2;
                byte brownPaint = 4;
                byte allWhite = (byte) (allClass * whitePaint);
                byte allBrown = (byte) (allClass* brownPaint);
                System.out.println("В школе, где " + allClass + " класов, нужно " + allWhite + " банк белой краски и " + allBrown + " банок коричневой краски ");

                short bananas;
                bananas = 5 * 80;
                short milkk;
                milkk = (200 / 100) * 105;
                short ice;
                ice = 2 * 100;
                short eggs;
                eggs = 4 * 70;
                short smoothie = (short) (bananas + milkk + ice + eggs);
                float smoothieKg = smoothie / 1000f;
                System.out.println("смузи" + smoothie + " грамм " + smoothieKg + " кг ");


                byte weightPerfect = (byte) 7.0;
                short spend = (short) 250.0;
                short spendMore = (short) 500.0;
                float maxDay = weightPerfect * (1000 / spend);
                float minDay = weightPerfect * (1000 / spendMore);
                float average = (maxDay + minDay) / 2;
                System.out.println(" слабая диета " + maxDay + " дней ; " + " хорошая диета " + minDay + " дней ; " + "средняя диета " + average + " дней ");

                int masha =  67760;
                int denis =  83690;
                int kristina =  76230;
                float mashaUp = masha * 0.1f;
                short mashaRich = (short) (masha + mashaUp);
                float denisUp = denis * 0.1f;
                short denisRich = (short) (denis + denisUp);
                float kristinaUp = kristina * 0.1f;
                short kristinaRich = (short) (kristina + kristinaUp);
                System.out.println("Маша тепрь получает " + mashaRich + " рублей. Годовой доход вырос на " + mashaUp + " рублей ");
                System.out.println("Маша тепрь получает " + denisRich + " рублей. Годовой доход вырос на " + denisUp + " рублей ");
                System.out.println("Маша тепрь получает " + kristinaRich + " рублей. Годовой доход вырос на " + kristinaUp + " рублей ");

            }

        }