# Программа для _Анализа статистики продаж._

## Права cобственности принадлежат магазиму "_Быстрый Хомяк_"
![логоип](https://bipbap.ru/wp-content/uploads/2018/02/wild-european-hamsters-fb12.png)

###  Состав файлов:
* файл Main
* файл  SalesManager
### Первая версия проекта.
```java
public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
```
