Post your opinions and suggestions about anything related to the language syntax and semantics here on this page.

# Language Discussion Page #

This is the first wiki page of the project! Throughout the project term, we are going to add more content to it as we update the language definition.

Feel free to add any improving comment.


# Details #

So far, although the project is named c-shell, we are in the process of working on a DSL called Guolice that is tailored for the specification of graphical user interfaces (GUI).

Guolice is a language that allows specification of GUI behaviors. The language allows simple
entities such as strings, simple geometric shapes (boxes, triangles, circles), events (click, key press).
It allows positional operators such as left of, right of, above, and below. It allows shape operations
such as equal, smaller than, bigger than, and contains. It also allows causal operations such as an
event precedes another event or precedes the appearance or the hiding of an entity.
Later on, the language can introduce a conditional structure where a behavior depends on the
current shapes and events. It also can introduce a recursive structure where shapes are dened in
terms of smaller shapes or behaviors are defined in terms of earlier or later behaviors.
Guolice specifies the behavior of a GUI application and facilitates testing it later on. Testing
GUI currently is a painful behavior and involves manual record and replay testing where even a
small change in the resolution of a screen can render a test suite obsolete. With Guolice and a
proper checker that checks whether a trace of a GUI execution violates a Guolice specification, GUI testing should become much easier.

You can find a short file about what things would be for now in the [Downloads](http://code.google.com/p/c-shell/downloads/list) section.