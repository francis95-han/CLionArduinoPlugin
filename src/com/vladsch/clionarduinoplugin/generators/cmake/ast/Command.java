package com.vladsch.clionarduinoplugin.generators.cmake.ast;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

public class Command extends Node {
    private BasedSequence command = BasedSequence.NULL;
    private BasedSequence openingMarker = BasedSequence.NULL;
    private BasedSequence arguments = BasedSequence.NULL;
    private BasedSequence closingMarker = BasedSequence.NULL;

    public Command() {
    }

    public Command(final BasedSequence chars) {
        super(chars);
    }

    @Override
    public BasedSequence[] getSegments() {
        return new BasedSequence[] { command, openingMarker, arguments, closingMarker };
    }


    @Override
    public void getAstExtra(StringBuilder out) {
        segmentSpanChars(out, command, "text");
        segmentSpanChars(out, openingMarker, "open");
        if (arguments.isNotNull()) segmentSpanChars(out, arguments, "arguments");
        segmentSpanChars(out, closingMarker, "close");
    }

    public BasedSequence getCommand() {
        return command;
    }

    public void setCommand(final BasedSequence command) {
        this.command = command;
    }

    public BasedSequence getOpeningMarker() {
        return openingMarker;
    }

    public void setOpeningMarker(final BasedSequence openingMarker) {
        this.openingMarker = openingMarker;
    }

    public BasedSequence getArguments() {
        return arguments;
    }

    public void setArguments(final BasedSequence arguments) {
        this.arguments = arguments;
    }

    public BasedSequence getClosingMarker() {
        return closingMarker;
    }

    public void setClosingMarker(final BasedSequence closingMarker) {
        this.closingMarker = closingMarker;
    }
}
