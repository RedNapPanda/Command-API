/*
 * Copyright (C) 2011-Current Richmond Steele (Not2EXceL) (nasm) <not2excel@gmail.com>
 * 
 * This file is part of kotlin.
 * 
 * kotlin can not be copied and/or distributed without the express
 * permission of the aforementioned owner.
 */
package com.minecave.commandapi;

@FunctionalInterface
public interface CommandNode {
    boolean dispatch();
}