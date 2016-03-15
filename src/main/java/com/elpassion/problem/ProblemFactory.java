package com.elpassion.problem;

import java.util.UUID;

public class ProblemFactory {

    private final String name;
    private final UUID uuid;

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public ProblemFactory(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
    }

    static ProblemFactory createProblemFactory(String name) {
        return new ProblemFactory(name);
    }

    public void createProblem() {
        throw new UnexpectedChild(name + " " + uuid);
    }
}
