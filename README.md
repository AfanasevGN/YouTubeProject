# YouTubeProject
Задание по автоматизации тестирования при помощи видеоуроков и YouTube
Текст задания:
Магазин с носками
Поднять контейнер из https://github.com/microservices-demo/microservices-demo .
Написать на языке Java e2e тест по авторизации и добавления товара в корзину.
Проверить, что сумма цены товаров в корзине соответствует сумме цен заказанных товаров.
В проекте использовать стек Java, Gradle, JUnit5, Playwright , Faker/ либо любой другой генератор данных, Allure2.
После прохождения тестов должен формироваться Allure-отчет.
* (Необязательно) Для Playwright - реализовать функцию для повторного переиспользования сохранённой сессии авторизации при запуске тестов.
Пункт про стек технологий пока опускаем, делай на том, что там показывают. А указанный стек попробуешь в деле уже после окончания уроков и видосов

Порядок воспроизведения результатов:
Предусловия - установлен и запущен docker desktop
1. В терминале ввести git clone https://github.com/microservices-demo/microservices-demo
2. cd microservices-demo
3. docker-compose -f deploy/docker-compose/docker-compose.yml up -d
4. для проверки работоспособности тестового сайта перейти на  http://localhost/ и зарегистрировать учетную запись с именем пользователя "afnsw" и паролем "xplosion-x" . Остальные данные заполнить произвольно
5. В момент прекращения работы почистить за собой:  docker-compose -f deploy/docker-compose/docker-compose.yml down
6. Клонировать текущий репозиторий к себе на машину и запустить  YoutubeProject/src/socks/SocksTest/CheckSumTest
