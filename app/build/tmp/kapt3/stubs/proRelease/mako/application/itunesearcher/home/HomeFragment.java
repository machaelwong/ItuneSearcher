package mako.application.itunesearcher.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\b\u0010\u0015\u001a\u00020\u000eH\u0016J0\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0002H\u0016J\u0006\u0010\"\u001a\u00020\u0013J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lmako/application/itunesearcher/home/HomeFragment;", "Lmako/application/itunesearcher/base/BaseBindingFragment;", "Lmako/application/itunesearcher/databinding/FragmentHomeBinding;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "adapter", "Lmako/application/itunesearcher/home/HomeListAdapter;", "filterCategory", "", "hasNextPage", "", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "spinnerSelectedId", "", "userInput", "viewModel", "Lmako/application/itunesearcher/home/HomeViewModel;", "actionSearch", "", "resetOffset", "getLayoutResources", "onItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "id", "", "onNothingSelected", "onStop", "onViewCreated", "viewBinding", "refreshFavourite", "submit", "homeInput", "Landroidx/appcompat/widget/AppCompatEditText;", "app_proRelease"})
public final class HomeFragment extends mako.application.itunesearcher.base.BaseBindingFragment<mako.application.itunesearcher.databinding.FragmentHomeBinding> implements android.widget.AdapterView.OnItemSelectedListener {
    private mako.application.itunesearcher.home.HomeViewModel viewModel;
    private mako.application.itunesearcher.home.HomeListAdapter adapter;
    private androidx.recyclerview.widget.LinearLayoutManager llm;
    private java.lang.String userInput = "";
    private int spinnerSelectedId = 0;
    private java.lang.String filterCategory = "song";
    private boolean hasNextPage = true;
    
    public HomeFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutResources() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    mako.application.itunesearcher.databinding.FragmentHomeBinding viewBinding) {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position, long id) {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent) {
    }
    
    public final void refreshFavourite() {
    }
    
    private final void submit(androidx.appcompat.widget.AppCompatEditText homeInput) {
    }
    
    public final void actionSearch(boolean resetOffset) {
    }
}