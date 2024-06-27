gen-and-compile: genJava compile

genJava:
	antlr4 -o ./src/antlr -package antlr -no-listener -visitor WenyanR.g4

compile:
	javac -cp /usr/share/java/antlr-complete.jar src/*/*.java src/*.java -d build

clean:
	rm src/antlr/* build/* -r

run:
	antlr4 -o test WenyanR.g4 && cd test && javac -cp /usr/share/java/antlr-complete.jar *.java && grun WenyanR program ../test.wy -gui

test: gen-and-compile
	java -cp build:/usr/share/java/antlr-complete.jar Test
