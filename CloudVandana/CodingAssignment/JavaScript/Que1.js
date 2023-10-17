// Take a sentance as an input and reverse every word in that sentance.
// Ex:This is a sunny day. O/p-> siht si a ynnus yad.

const inpSentence = "This is a sunny day";
  const revSentence = revWord(inpSentence);
  function revWord(sentence) {
    const words = sentence.split(' ');
  
    const reverseWords = words.map(word => {
      return word.split('').reverse().join('');
    });
  
    return reverseWords.join(' ');
  }
  
  console.log(revSentence);
  