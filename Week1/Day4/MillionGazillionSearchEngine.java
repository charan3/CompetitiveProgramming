import java.io.*;

class Trie
{
    final int ALPHABET_SIZE=26;
    TrieNode root=new TrieNode();
    class TrieNode
    {
        TrieNode[] children=new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;
        TrieNode()
        {
            isEndOfWord=false;
            for(int i=0;i<ALPHABET_SIZE;i++)
            {
                children[i]=null;
            }
        }

    }
    public boolean insert(String key)
    {
        int level;
        int length=key.length();
        int index;
        TrieNode node=root;
        for(level=0;level<length;level++)
        {
            index=key.charAt(level)-'a';
            if(node.children[index]==null)
                node.children[index]=new TrieNode();

            node=node.children[index];
        }
        if(node.isEndOfWord==true)
        {
            return false;
        }
        else
        {
            node.isEndOfWord = true;
            return true;
        }
    }
    public boolean search(String key)
    {
        int level;
        int length=key.length();
        int index;
        TrieNode node=root;
        for(level=0;level<length;level++)
        {
            index=key.charAt(level)-'a';
            if(node.children[index]==null)
                return false;

            node=node.children[index];
        }
        return node!=null && node.isEndOfWord;
    }
}
public class MillionGazillionSearchEngine {


    public static void main(String[] args) {
        Trie t=new Trie();
        System.out.println(t.insert("catch"));
        System.out.println(t.insert("cakes"));
        System.out.println(t.insert("cake"));

        System.out.println(t.insert("cake"));
        System.out.println(t.insert("catch"));

        System.out.println(t.insert("hello"));



    }

}
