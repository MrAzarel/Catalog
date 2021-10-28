#include <iostream>
#include <vector>
#include <ctime>

using namespace std;

class Humans {
public:
    string name;
    string clas;
    int health;
    string action;

    void set_name(string name_human) {
        name = name_human;
    }

    void set_clas(string clas_human) {
        clas = clas_human;
    }

    void set_health(int health_human) {
        health = health_human;
    }

    void set_action(string action_human) {
        action = action_human;
    }

    string get_name() {
        return name;
    }

    string get_clas() {
        return clas;
    }

    int get_health() {
        return health;
    }

    string get_action() {
        return action;
    }
};

void add(string name, string clas, int health, string action, vector<Humans>& v1) {
    Humans human;
    human.set_name(name);
    human.set_clas(clas);
    human.set_health(health);
    human.set_action(action);
    v1.push_back(human);
}

void give_n_take(Humans& human, Humans& human2) {
    if (human.get_action() == "bake pies") {
        human.set_health(human.get_health() - 10);
        human2.set_health(human2.get_health() + 5);
    }
    if (human.get_action() == "healing people") {
        human.set_health(human.get_health() - 40);
        human2.set_health(human2.get_health() + 20);
    }
    if (human.get_action() == "giving a concert") {
        human.set_health(human.get_health() - 20);
        human2.set_health(human2.get_health() + 10);
    }
}

int main()
{
    srand(time(nullptr));
    vector<Humans> v1;
    setlocale(LC_ALL, "Rus");
    int answer, answer_2, count = 0;
    do
    {
        cout << "Хотите добавить нового человека" << endl << "1. Да" << endl << "2. Нет" << endl << endl;
        cin >> answer;
        cout << endl;
        if (answer == 1) {
            cout << "Добавить: " << endl << "1. Бабушка" << endl << "2. Врач" << endl << "3. Музыкант" << endl << endl;
            int health = rand();
            cin >> answer_2;
            if (answer_2 > 3 || answer_2 < 1)
                cout << "Внимание! Такого человека не существует" << endl << endl;
            else {
                cout << endl << "Введите имя" << endl;
                Humans human;
                string name;
                cin >> name;
                switch (answer_2)
                {
                case 1:
                    health %= 30;
                    add(name, "old_Ledy", health, "bake pies", v1);
                    human = { name, "old_Ledy", health, "bake pies" };
                    break;
                case 2:
                    health %= 100;
                    add(name, "doctor", health, "healing people", v1);
                    human = { name, "doctor", health, "healing people" };
                    break;
                case 3:
                    health %= 80;
                    add(name, "musician", health, "giving a concert", v1);
                    human = { name, "musician", health, "giving a concert" };
                    break;
                }
                cout << endl << "Вы добавили:" << endl << human.get_name() << endl << human.get_clas() << endl << "Здоровье: " << human.get_health() << endl << human.get_action() << endl << endl;
                count++;
            }
        }
    } while (answer != 2);

    if (count > 1) {
        while (count > 1)
        {
            int i = rand() % count;
            int  number = rand() % count;
            if (number != count)
                give_n_take(v1[i], v1[number]);
            if (v1[i].get_health() <= 0) {
                v1.erase(v1.begin() + i);
                count--;
            }
        }
    }
    if (v1.size() > 0)
        cout << v1[0].get_name() << endl << v1[0].get_clas() << endl << v1[0].get_health() << endl << v1[0].get_action() << endl;
};