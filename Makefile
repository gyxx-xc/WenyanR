gen-and-compile: genJava compile

genJava:
	antlr4 -o ./src/antlr -package antlr -no-listener -visitor WenyanR.g4


compile:
	javac -cp /usr/share/java/antlr-complete.jar src/*.java src/antlr/*.java -d build

clean:
	rm src/antlr/* build/* -r

run: gen-and-compile
	cd build/antlr && grun WenyanR program -gui

test: gen-and-compile
	java -cp build:/usr/share/java/antlr-complete.jar Test
