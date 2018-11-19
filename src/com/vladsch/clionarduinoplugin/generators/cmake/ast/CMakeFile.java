package com.vladsch.clionarduinoplugin.generators.cmake.ast;

import com.vladsch.flexmark.ast.Document;
import com.vladsch.flexmark.util.Pair;
import com.vladsch.flexmark.util.options.DataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;

import java.util.List;

public class CMakeFile extends Document {
    final private List<Pair<String, BasedSequence>> errors;

    public CMakeFile(final DataHolder options, final BasedSequence chars, List<Pair<String, BasedSequence>> errors) {
        super(options, chars);
        this.errors = errors;
    }

    public List<Pair<String, BasedSequence>> getErrors() {
        return errors;
    }
}
