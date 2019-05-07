# shadow-reagent-flip-move-example

## Getting started

Here's instructions on how to run the project in development

### From the command-line

```
cd shadow-reagent-flip-move-example
npm i
npx shadow-cljs watch app
```

Open a browser to http://localhost:8700.


### Using CIDER

This assumes you have latest CIDER installed.

Ensure you have run `npm i` in the repository. Then, execute the following in
Emacs:

1. `M-x cider-jack-in-clojurescript`
2. Select `shadow` from the REPL selection
3. Type `app` for the build to running
4. Type `y` to open up http://localhost:8700 in a browser

### Connecting remotely

If you've already started the build from teh command line (first option above),
and you want to connect CIDER to it, you can do the following in Emacs:

1. `M-x cider-connect`
2. Select `localhost`
3. The port should auto-populate. If not, note the nREPL port printed in the
terminal shadow-cljs is running in.
4. Once connected to the CLJ REPL, evaluate `(shadow/repl :app)`
