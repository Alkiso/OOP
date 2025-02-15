/*
 * INFO0062 - Object-Oriented Programming
 * Project basis
 *
 * Example code to filter a WAV file using audio.jar. The filter has to be implemented first.
 *
 * @author: J.-F. Grailet (ULiege)
 */

import be.uliege.montefiore.oop.audio.*; // Will import: TestAudioFilter, Filter, FilterException

public class Example
{
    public static void main(String[] args)
    {
        try
        {
            Filter df = new DelayFilter(44100 * 5); // 3seconds

			//Filter df = new GainFilter(0.01); // 3seconds


            TestAudioFilter.applyFilter(df, "Virtual_Insanity_1m.wav", "Filtered.wav");
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
