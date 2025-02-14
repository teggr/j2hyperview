package dev.rebelcraft.j2hyperview.behaviours.atributes;

import dev.rebelcraft.j2hyperview.tags.Tag;

public interface IStandardBehaviours<T extends Tag<T>> extends
        IAction<T>,
        IDelay<T>,
        IHideDuringLoad<T>,
        IHref<T>,
        INewValue<T>,
        IOnce<T>,
        IShowDuringLoad<T>,
        ITarget<T>,
        ITrigger<T>,
        IVerb<T>
{
}
