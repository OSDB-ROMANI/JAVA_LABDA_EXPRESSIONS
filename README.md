# JAVA_LABDA_EXPRESSIONS
L'idea è quella di implementare un metodo astratto direttamente al momento del suo utilizzo, al posto di implemetarlo in una classe e generare un oggetto.
<h2>PROCEDIMENTO</h2>
<li>REQUISITI</li>
<ol>
  <li>Dobbiamo avere un'interfaccia</li>
  <li>L'interfaccia deve avere solo e solo un metodo</li>
  <li>E' buona norma utilizzare l'annotation @FunctionalInterface</li>
  <li>L'intefaccia così costruita prende il nome di interfaccia funzionale</li>
</ol>
<li>UTILIZZO</li>
<ol>
  <li>Possiamo utilizzare l'interfaccia e implementare il codice direttante alla bisogna</li>
    <ul>
      <li>Definiamo un oggetto del tipo dell'interfaccia</li>
      <li>Implementiamo il metodo con un assegnamento =</li>
      <li>Per far riferimento al metodo basta l'utilizzo ()</li>
      <li>Se il metodo vuole dei parametri vanno inseriti, in caso i un solo parametro posso evitare le ()</li>
      <li>Devo utilizzare il simbolo -></li>
      <li>Inserisco tutte le righe di codice, se più di una utilizzo le { }</li>
      <li>Eseguo il metodo tramite nome oggetto . metodo</li>
    </ul>
  <li>Possiamo creare un metodo che riceve in input un'oggetto del tipo dell'interfaccia</li>
    <ul>
      <li>Il metodo deve ricevare in input un'oggetto del tipo dell'interfaccia</li>
      <li>Al fine dell'utilizzo della Lambda non è importante il contenuto del metodo</li>
      <li>E' possibile ridefinire il metodo creato esattamente come abbia fatto nel caso precedente</li>
      <li>Richiamiamo il metodo creato utilizzando il suo nome</li>
    </ul>
  <li>Vedere esempio PROVA</li>
</ol>
<li>Esempio più complesso Lamba</li>
