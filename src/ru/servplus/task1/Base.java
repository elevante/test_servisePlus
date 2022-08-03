package ru.servplus.task1;

import java.util.OptionalInt;

public class Base {
    int id;
    String description;
    OptionalInt kind;

    public Base(int id, String description, OptionalInt kind) {
        this.id = id;
        this.description = description;
        this.kind = kind;
    }

    public static String checkKind(Base base) {
        if (base.kind.isPresent()) {
            if (base.kind.getAsInt() % 2 == 0) {
                return "Четное";
            } else {
                return base.description;
            }
        }
        return "Неизвестно";
    }
}
